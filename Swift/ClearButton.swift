//
//  ClearButton.swift
//  Project
//
//  Created by Abu Nabe on 27/8/21.
//

import UIKit

class ClearButton: UITextField {

    override func clearButtonRect(forBounds bounds: CGRect) -> CGRect {

        let originalRect = super.clearButtonRect(forBounds: bounds)

        //move 10 points left

        return originalRect.offsetBy(dx: -30, dy: 0)
    }
}

