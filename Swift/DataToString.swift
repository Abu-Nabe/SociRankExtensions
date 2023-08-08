//
//  DataToString.swift
//  Project
//
//  Created by Abu Nabe on 20/10/2022.
//

import UIKit

extension NSData {
    public func toString() -> String {
        return String(data: self as Data, encoding: .utf8) ?? "";
    }
}
