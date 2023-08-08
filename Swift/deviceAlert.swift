//
//  ipadAlert.swift
//  Project
//
//  Created by Abu Nabe on 28/7/2022.
//

import UIKit

class deviceAlert{
    public static func alert() -> UIAlertController.Style
    {
        var alertStyle = UIAlertController.Style.actionSheet
        
        if (UIDevice.current.userInterfaceIdiom == .pad) {
          alertStyle = UIAlertController.Style.alert
        }
        
        return alertStyle
    }
}
