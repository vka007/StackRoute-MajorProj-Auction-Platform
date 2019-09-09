export interface Item{
  
    itemId: BigInteger,
    itemName: string,
    itemDescription: string,
    itemCategory: string,
    itemQuality: string,
    numberOfDaysForRent: BigInteger,
    itemBaseRent: DoubleRange,
    minimumBiddingAmount: DoubleRange,
    timeLeft: BigInteger,
    latestBid: DoubleRange,
    yourBid: DoubleRange,
    numberOfDaysNeeded: BigInteger,
    userEmailId: string,
    userName: string,
    userPhoneNumber: BigInteger,
    bidderEmailId: string,
    biddername: string,
    bidderPhoneNumber: BigInteger
}