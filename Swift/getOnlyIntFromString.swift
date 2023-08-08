//
//  getOnlyIntFromString.swift
//  Project
//
//  Created by Abu Nabe on 2/10/2022.
//

import UIKit

extension Int {
    static func parse(from string: String) -> Int? {
        return Int(string.components(separatedBy: CharacterSet.decimalDigits.inverted).joined())
    }
}
