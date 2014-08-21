package g0v.moedict;

import g0v.moedict.entity.Word;
import retrofit.http.GET;
import retrofit.http.Path;


/**
 * @author HondaDai
 * @date 2014/08/21
 * 
 * ref: https://g0v.hackpad.com/3du.tw-ZNwaun62BP4#:h=API-實作
 */

public interface MoeDictService {
	
	final public String API_URL = "https://www.moedict.tw/";
	
	@GET("/uni/{word}")
	public Word findWord(@Path("word") String word);
	
	
	
	
}
