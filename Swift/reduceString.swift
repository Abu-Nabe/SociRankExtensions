//
//  reduceString.swift
//  Project
//
//  Created by Abu Nabe on 20/9/2022.
//

import UIKit

extension String {
    func shorted(to symbols: Int) -> String {
        guard self.count > symbols else {
            return self
        }
        return self.prefix(symbols) + " ..."
    }
}
