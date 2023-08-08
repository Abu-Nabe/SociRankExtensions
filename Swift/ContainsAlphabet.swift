//
//  containsAlphabet.swift
//  Project
//
//  Created by Abu Nabe on 1/8/2023.
//


class ContainsAlphabet{
    static func containsAlphabets(_ str: String) -> Bool {
        let pattern = ".*[a-zA-Z].*"
        return str.range(of: pattern, options: .regularExpression) != nil
    }
}


