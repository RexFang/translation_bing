package translation.test;

import java.io.IOException;
import java.util.Date;

import org.apache.http.client.ClientProtocolException;

import translation.util.BingTranslationUtil;

import com.memetix.mst.language.Language;
import com.memetix.mst.translate.Translate;

public class TestMain {

	public static void main(String[] args) throws ClientProtocolException, IOException, Exception {
		Translate.setClientId(BingTranslationUtil.getClientId());
	    Translate.setClientSecret(BingTranslationUtil.getCientSecret());
	    System.out.println(new Date());
	    String translatedText = Translate.execute("����������Ĺ������ˣ��ô�ҵ����ȥ�������ˣ�������̫��ı�Թ����λͬ�£�������һ����һ�գ�ÿ���������ô��ֵ�ñ�Թ����ô��ֵ���²۵��ÿ��һ�ϰ��ֻ��������ͣ���²۸���ͣ�����˰໹�ǡ�������������ε��֮ǰ�Ƿ����ü���һ��������˾�ľ��ģ�������ε������Ϊ����ѡ��ε������˾����Ҵ����ĸ��ָ�����Ϊʲôû�п�����Ҷ�õĵط�����ĵ��ޣ��Բ���֮���ĸ���İ��ݣ�ȴ��������˶���²ۡ���һ�칫˾��Щ������ȫ����ʧ�ˣ���һ᲻���û��ʲôֵ���²۵��ˣ�", Language.CHINESE_TRADITIONAL, Language.ENGLISH);
//	    String translatedText = Translate.execute("��������Һܿ���", Language.CHINESE_TRADITIONAL, Language.ENGLISH);
//	    String translatedText = Translate.execute("�������ģ�����ʼ��", Language.CHINESE_TRADITIONAL, Language.ENGLISH);
//	    String translatedText = Translate.execute("���", Language.CHINESE_TRADITIONAL, Language.ENGLISH);
	    System.out.println(translatedText);
	    System.out.println(new Date());
	}
}
