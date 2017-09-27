package com.zorro.manage.common.util;

import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;

public class TokenUtil {
	public static String generateToken(String uid) {
		/**
		 * md5(uid + md5(uid))
		 */
		String uidMd5 = Hashing.md5().newHasher().putString(uid, Charsets.UTF_8).hash().toString();
		String token = Hashing.md5().newHasher().putString(uid + uidMd5, Charsets.UTF_8).hash().toString();
		return token;
	}
	
	public static boolean checkToken(String uid, String token) {
		return generateToken(uid).equals(token);
	}
}
