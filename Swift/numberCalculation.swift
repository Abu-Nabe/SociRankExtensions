//
//  numberCalculation.swift
//  Project
//
//  Created by Abu Nabe on 23/10/21.
//

import UIKit

extension UIViewController{
    
    func formatPoints(from: Int) -> String {
        let num = Double(from)
        var thousandNum = num/1000
            var millionNum = num/1000000
            if num >= 1000 && num < 1000000{
                if(floor(thousandNum) == thousandNum){
                    return("\(Int(thousandNum))k")
                }
                return("\(thousandNum.roundToPlaces(places: 1))k")
            }
            if num > 1000000{
                if(floor(millionNum) == millionNum){
                    return("\(Int(thousandNum))k")
                }
                return ("\(millionNum.roundToPlaces(places: 1))M")
            }
            else{
                if(floor(num) == num){
                    return ("\(Int(num))")
                }
                return ("\(num)")
            }
    }
}
extension Double {
    /// Rounds the double to decimal places value
    mutating func roundToPlaces(places:Int) -> Double {
        let divisor = pow(10.0, Double(places))
        return Darwin.round(self * divisor) / divisor
    }
}
