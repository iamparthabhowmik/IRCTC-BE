package org.example.utils;

import org.mindrot.jbcrypt.BCrypt;

public class UserServiceUtil {
    public static Boolean checkPassword(String plainPassword, String hashedPassword){
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }

    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
}
