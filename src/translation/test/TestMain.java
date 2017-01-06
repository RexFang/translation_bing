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
	    String translatedText = Translate.execute("我想真的用心工作的人，用创业的心去工作的人，不会有太多的抱怨，各位同事，咱们忍一忍收一收，每天真的有那么多值得抱怨，那么多值得吐槽的嘛？每天一上班手机就震个不停，吐槽个不停，下了班还是……想想您进入蔚来之前是否做好加入一个初创公司的决心，不看好蔚来，你为何又选择蔚来。公司给大家带来的各种福利，为什么没有看到大家多好的地方更多的点赞，对不足之处的更多的包容，却是引来如此多的吐槽。哪一天公司这些福利，全都消失了，大家会不会就没有什么值得吐槽的了？", Language.CHINESE_TRADITIONAL, Language.ENGLISH);
//	    String translatedText = Translate.execute("你快乐吗？我很快乐", Language.CHINESE_TRADITIONAL, Language.ENGLISH);
//	    String translatedText = Translate.execute("不忘初心，方得始终", Language.CHINESE_TRADITIONAL, Language.ENGLISH);
//	    String translatedText = Translate.execute("你好", Language.CHINESE_TRADITIONAL, Language.ENGLISH);
	    System.out.println(translatedText);
	    System.out.println(new Date());
	}
}
