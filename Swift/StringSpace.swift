//
//  StringSpace.swift
//  Project
//
//  Created by Abu Nabe on 20/3/22.
//

extension String {

    /// Returns a condensed string, with no extra whitespaces and no new lines.
    var condensed: String {
        return replacingOccurrences(of: "[\\s\n]+", with: " ", options: .regularExpression, range: nil)
    }
}
