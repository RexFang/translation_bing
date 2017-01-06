package translation.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @ClassName BingTranslationUtil
 * @Description TODO ��Ӧ����API������Ϣ
 * @author FangRuitao
 * @date 2016��8��27��
 */
public class BingTranslationUtil {
	//Client Id
	private String clientId;
	
	//Client Secret
	private String cientSecret;
	
	private static final BingTranslationUtil bingTranslationUtil = new BingTranslationUtil();
	
	/**
	 * @Description:TODO ���캯������ʼ�����ʻ���Կ���ͻ� ID
	 * @author FangRuitao
	 * @throws IOException 
	 * @date 2016��8��27��
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
