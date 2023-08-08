//
//  getAge.swift
//  Project
//
//  Created by Abu Nabe on 22/12/21.
//

import UIKit

class getAge: UIViewController{
    
    // usage print(calcAge("06/29/1988"))
    static func calcAge(birthday: String) -> Int {
        let dateFormater = DateFormatter()
        dateFormater.dateFormat = "MM/dd/yyyy"
        let birthdayDate = dateFormater.date(from: birthday)
        let calendar: NSCalendar! = NSCalendar(calendarIdentifier: .gregorian)
        let now = Date()
        let calcAge = calendar.components(.year, from: birthdayDate!, to: now, options: [])
        let age = calcAge.year
        return age!
    }
}
