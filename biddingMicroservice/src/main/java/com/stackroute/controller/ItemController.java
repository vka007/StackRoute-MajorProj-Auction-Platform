package com.stackroute.controller;

import com.stackroute.model.Item;
import com.stackroute.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class ItemController {
    @Autowired
    ItemRepository itemRepo;

    @RequestMapping("/getAllItems")
    @ResponseBody
    public ResponseEntity<Map<Integer,Item>> getAllItems(){
        Map<Integer,Item> items =  itemRepo.getAllItems();
        return new ResponseEntity<Map<Integer,Item>>(items, HttpStatus.OK);
    }

    @GetMapping("/item/{itemId}")
    @ResponseBody
    public ResponseEntity<Item> getItem(@PathVariable int itemId){
        Item item = itemRepo.getItem(itemId);
        return new ResponseEntity<Item>(item, HttpStatus.OK);
    }

    @PostMapping(value = "/addItem",consumes = {"application/json"},produces = {"application/json"})
    @ResponseBody
    public ResponseEntity<Item> addItem(@RequestBody Item item,UriComponentsBuilder builder){
        itemRepo.addItem(item);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/addItem/{id}").buildAndExpand(item.getItemId()).toUri());
        return new ResponseEntity<Item>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/updateItem/{itemId}/{itemCurrentBid}/{noOfDaysNeeded}")
    @ResponseBody
    public ResponseEntity<Item> updateItem(@PathVariable int itemId, @PathVariable double itemCurrentBid, @PathVariable int noOfDaysNeeded){
        Item item=itemRepo.getItem(itemId);
        if(item != null){
//            double itemMinBid=item.getMinimumBiddingAmount()+100;
            double itemLatestBid=item.getLatestBid();
            int duration=item.getNumberOfDaysForRent();
            if(noOfDaysNeeded<=duration && itemCurrentBid >= itemLatestBid+100)
            {
                item.setNumberOfDaysNeeded(noOfDaysNeeded);
                item.setLatestBid(itemCurrentBid);
                item.setMinimumBiddingAmount(item.getLatestBid()+100);
                item.setYourBid(itemCurrentBid);
            }
            itemRepo.updateItem(item);
        }
        return new ResponseEntity<Item>(item, HttpStatus.OK);
    }

//    @DeleteMapping("/delete/{id}")
//    @ResponseBody
//    public ResponseEntity<Void> deleteItem(@PathVariable int id){
//        itemRepo.deleteItem(id);
//        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
//    }
}
