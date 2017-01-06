package translation.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @ClassName BingTranslationUtil
 * @Description TODO 必应翻译API配置信息
 * @author FangRuitao
 * @date 2016年8月27日
 */
public class BingTranslationUtil {
	//Client Id
	private String clientId;
	
	//Client Secret
	private String cientSecret;
	
	private static final BingTranslationUtil bingTranslationUtil = new BingTranslationUtil();
	
	/**
	 * @Description:TODO 构造函数，初始化主帐户密钥、客户 ID
	 * @author FangRuitao
	 * @throws IOException 
	 * @date 2016年8月27日
	 */
	private BingTranslationUtil() {
		try {
			Properties preperties = new Properties();
			InputStream is = Object.class.getResourceAsStream("/translation/resource/conf.properties");
			preperties.load(is);
			this.clientId = preperties.getProperty("bing.client_id", "70f0f5d8-4d56-488a-a714-0f4777df930b").trim();
			this.cientSecret = preperties.getProperty("bing.client_seret", "da6TWJHc15QIDXNW0nbbVyJOFD41q/9RghAvyIAD6yY").trim();
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getClientId() {
		return bingTranslationUtil.clientId;
	}

	public static String getCientSecret() {
		return bingTranslationUtil.cientSecret;
	}
}
