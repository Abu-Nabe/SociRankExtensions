//
//  TemporaryEmail.swift
//  Project
//
//  Created by Abu Nabe on 24/4/2023.
//

import UIKit

class TemporaryEmail{
    static func tempEmailCheck(email: String) -> Bool{
        if(email == ""){
            return true
        }
        
        let emailComponents = email.split(separator: "@")
        let emailDomain = String(emailComponents[1]).lowercased()
        let temporaryDomains = ["privaterelay.appleid.com"]
        return temporaryDomains.contains(emailDomain)
    }
}
