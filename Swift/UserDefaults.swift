//
//  UserDefaults.swift
//  Project
//
//  Created by Abu Nabe on 26/7/21.
//

import UIKit

extension UserDefaults{

    //MARK: Check Login
    func setLoggedIn(value: Bool) {
        set(value, forKey: UserDefaultsKeys.isLoggedIn.rawValue)
        //synchronize()
    }

    func isLoggedIn()-> Bool {
        return bool(forKey: UserDefaultsKeys.isLoggedIn.rawValue)
    }

    //MARK: Save User Data
    func setUserID(value: String){
        set(value, forKey: UserDefaultsKeys.userID.rawValue)
        //synchronize()
    }

    //MARK: Retrieve User Data
    func getUserID() -> String{
        return string(forKey: UserDefaultsKeys.userID.rawValue)!
    }
    
    func setUsername(value: String){
        set(value, forKey: UserDefaultsKeys.username.rawValue)
        //synchronize()
    }

    //MARK: Retrieve User Data
    func getUsername() -> String{
        return string(forKey: UserDefaultsKeys.username.rawValue) ?? ""
    }
    
    func setProfilePic(value: String){
        set(value, forKey: UserDefaultsKeys.profilepic.rawValue)
        //synchronize()
    }

    //MARK: Retrieve User Data
    func getProfilePic() -> String{
        return string(forKey: UserDefaultsKeys.profilepic.rawValue)!
    }
    
    func setHobby(value: String){
        set(value, forKey: UserDefaultsKeys.hobby.rawValue)
        //synchronize()
    }

    //MARK: Retrieve User Data
    func getHobby() -> String{
        return string(forKey: UserDefaultsKeys.hobby.rawValue) ?? ""
    }
    
    func setSave(value: Bool) {
        set(value, forKey: UserDefaultsKeys.isSaved.rawValue)
        //synchronize()
    }

    func isSaved()-> Bool {
        return bool(forKey: UserDefaultsKeys.isSaved.rawValue)
    }
    
    func setShowPoints(value: String){
        set(value, forKey: UserDefaultsKeys.points.rawValue)
        //synchronize()
    }

    //MARK: Retrieve User Data
    func getShowPoints() -> String{
        return string(forKey: UserDefaultsKeys.points.rawValue) ?? "true"
    }

    
    func setShowFriendPoints(value: String) {
        set(value, forKey: UserDefaultsKeys.friendPoints.rawValue)
        //synchronize()
    }

    func getShowFriendPoints()-> String {
        return string(forKey: UserDefaultsKeys.friendPoints.rawValue) ?? "true"
    }
    
    func setShowSearchIcon(value: String) {
        set(value, forKey: UserDefaultsKeys.searchIcon.rawValue)
        //synchronize()
    }

    func getShowSearchIcon()-> String {
        return string(forKey: UserDefaultsKeys.searchIcon.rawValue) ?? "true"
    }
    
    func setToken(value: String) {
        set(value, forKey: UserDefaultsKeys.token.rawValue)
        //synchronize()
    }

    func getToken()-> String {
        return string(forKey: UserDefaultsKeys.token.rawValue) ?? ""
    }
    
    func setRecommended(value: String) {
        set(value, forKey: UserDefaultsKeys.recommended.rawValue)
        //synchronize()
    }

    func getRecommended()-> String {
        return string(forKey: UserDefaultsKeys.recommended.rawValue) ?? ""
    }
    
    func setstartUp(value: String) {
        set(value, forKey: UserDefaultsKeys.startUp.rawValue)
        //synchronize()
    }

    func getstartUp()-> String {
        return string(forKey: UserDefaultsKeys.startUp.rawValue) ?? ""
    }
    
    func setVote(value: String) {
        set(value, forKey: UserDefaultsKeys.vote.rawValue)
        //synchronize()
    }

    func getVote()-> String {
        return string(forKey: UserDefaultsKeys.vote.rawValue) ?? ""
    }
    
    

    // To remove object, use when logged out
//    UserDefaults.standard.removeObject(forKey: UserDefaultsKeys.userID)
    
//    UserDefaults.standard.removeObject(forKey: UserDefaultsKeys.isLoggedIn.rawValue)
}
