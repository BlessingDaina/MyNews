package com.example.mynews.db;

import java.util.ArrayList;

import com.example.mynews_bean.News;

public class Newslist {
	
	static ArrayList<News> list = new ArrayList<News>();
	
	public static ArrayList<News> initNews(){
		
		list.add(new News(0,"�ɽ���̨�塢��������ɳ ��������Щ�����뻣˭�� ",
				"<p>��ԭ���⣺�ɾ�����̨�庣Ͽ��B-52�ɵ��й���ɳ������Щ���ŵ������뻣˭���� </p>\n <p> ̨������ط���δ�γ��������¶��ţ�ϣ����һ�첻�ᵽ��������һ���������������棬�й��϶��޴����ˣ�Ϊά��������Ȩ�����ϲ�ϧ�����κδ��ۡ�</p>\n  <p>������ý�屨�����������ڿ�����ǲһ�Ҿ���ͨ��̨�庣Ͽ�������Ϣ��ʵ����ζ�Ż�ʢ��׼����ȡ�����ж���չʾ��Ի�ʩѹ����̬���������Ϣ������ͬһ�죬��������B-52��ը���������ӹص���ɵֽ��й���ɳȺ���������������̫ƽ��վ��������ַ���������B-52�ɵ�����ɳ������ </p>\n",
				"news_1"," "));
		list.add(new News(0,"���⽻����Ӧ����޺���ʩѹҪ����ı���̨��ʶ��",
				"<p>��ԭ���⣺2018��6��5���⽻�������˻���Ө�������м��߻ᣩ</p>\n <p>�ʣ����հĴ������ⳤ�����й�����޺��չ�˾ʩѹ��Ҫ����ı���վ��̨��ʶ����˽Ӫ��ҵ��Ӫ���Ӧ������ѹ�����š��з��Դ��к����ۣ� </p>\n  <p> ����ע�⵽�йر�����������ֻ��һ���й�����ۡ�̨�塢���Ŵ��������й���һ���֣����ǿ͹���ʵ��������ʶ��Ҳ�ǹ��������ձ鹲ʶ��������ⲻ����ͨ�ĳ����Ի��������⡣�з��йز���֪ͨ�������й�������һ���й�ԭ���ϵ�һ�ᡢ�ᶨ�������й�Ҫ������Ϸ���������ʲô�����θ�Ԥ�����ߡ�����ѹ�������κ����й���Ӫ����ҵ��Ӧ�����й��ķ��ɷ��棬���غ�����һ���й�ԭ���������������ѭ��</p>\n",
				"news_2"," "));
		list.add(new News(0," 95��Ů��ѧ����������ɳĮ �������ʰ��½���600Ԫ",
				"<p>��ԭ���⣺95��Ů��ѧ�������������������ɳĮ �������ʰ��½���600Ԫ�� </p>\n <p>���ζ����������а�������˵��һֱ�Ǹ��ľ���������ս�����з�ʽ��Ȼ�����Ĵ�������ѧ����Ů�������ȴ���ú���ٵ�ʱ�䣬�������������ɳĮ��˹���������������Σ���·�Ͼ����ɳ����������������ɶ��������߷��������������ĵã�������·���һ��������ָ������˺��£����ǲ����������ҵ�˼ά���۽磬��������ȷ��δ����Ŀ���������Ժ󣬶�����ֻ�����ʡǮ̫��Ƭ�棬Ӧ�����������һ�Ű�ֽ�����������еľ������� </p>\n  <p> �����˵���Լ�18���ϴ�һʱ���μ���һ������־Ը�ߵĻ��ȥ˹�����������Ŷ����Լ��ĳ��ԣ��㱨���������ڳ���û�о��飬������Щ����ţ������������������װ�����࣬����Ϊ��־Ը�߻���˴γ��еľ������ڳ����ģ�����ͨ����һ�����ƽ̨д�ڳ��ŵķ�ʽ��һ�ܵ�ʱ��Ｏ����4000�飬����������Ʊ��ס�޷ѣ��Լ����������˼��ٿ�Ǯ�����п�����</p>\n",
				"news_3"," "));
		
		
		list.add(new News(1,"15����Ա���������3000�򣬾�����˽��ǩ�����ձ� ",
				"<p>��5�µ׽����ġ���è�����У��й�U19������״ζ�ø������¹ھ�����ҫ���������֧����У�δ��17��Ĺ���ӿ缶�����������Ĵ����Ըе��ǳ�İ���� </p>\n  <p> 9��ʱ��ֻ���ڳɶ�������ѵ����ĺ�����������ݸ��ӿ���׾��ֲ��ܽ��������͵��������ߣ�����������������������Ѿ�����Ϊ����2001������г�����͵���Ա��</p>\n <p> �������ں��Ŵ��ѵĺ���������Ȼ�ڡ���è�����������ϵ�ע����ֲ����Ƕ�ݸ��ӿ����ʵ�����ڽ��괺�ں����Ҳû�й�ӣ����Ǳ������˴�ȥ���ձ����������Ϻ�����ݶӡ�</p>\n  <p>Ŀǰ����ݸ��ӿ���ֲ����ں;�����Э������ת�ᡱ�������������飬���й���̳�ѳ�һ���ձ����󣬻���˵���� </p>\n",
				"news_4"," "));
		list.add(new News(1,"�����������š�����!�׷�6��ΥԼ��30��ŷ ˭�Ҷ� ",
				"<p>ȥ�����죬���������ߣ���������ӷǳ��Ǳ���������Ϊ�����ƹ�������ֱ���ü���ΥԼ��ʽ�����˰����ˣ�֧����ת�����2.22��ŷԪ������ν����һǵ��һ�ǡ������������뿪�󣬰�����������ΥԼ�����Ҫ�ԣ��������Լ��ķ�ٵٵ�ʱ��˫���趨��ΥԼ��ʹﵽ��5��ŷԪ���������������̵��˰�������ΥԼ���������������ˣ���ֵ�ﵽ30��ŷԪ�� </p>\n  <p>���������뿪�󣬰�����Լ�˺ܶ���س������оͰ���÷��������͢�˵ĺ�ͬΥԼ����7��ŷԪ����Ƥ�˵�ΥԼ��ﵽ��5��ŷԪ�����⣬�ޱ��к���ķ�ٵٵ�ΥԼ��ͬ����5��ŷԪ���������������ڲ���ļ۸� </p>\n ",
				"news_5"," "));
		list.add(new News(1,"С����!����˹��!�����˲���Ⱥ������ �¹�������! ",
				"<p> ��������6��5�ձ�����</p>\n  <p>�������Ŷ���ǩԼ�ĵ¹����Ҷ��ڱ���ʱ��6��4�չ��������籭���յ�23�˴�������������ѡ������Ȼ�󲨡����Ӣ����������Ϊ�λᱻ�շ����䣿�¹��ӵ�������ܺ�ս�����ֻ��������ã� </p>\n <p>�¹���23�˴��������£��Ž���ŵ����������Ľ��ڣ����ض�ʩ�ظ����������ǣ��������գ�����ʥ�ն���������������÷��˹������Ľ��ڣ���������������Ľ��ڣ������գ�����Ľ��ڣ������ϸ��ж�����������ϣ������Ľ��ڣ������ض������ˣ����տ��У���¡�������������أ����ֺ��������г����յ���������ͼ˹��������˹���ʼ�����������ల�����ǣ���³�ϣ�����Ľ��ڣ������״Ŀ���ɳ����04�������������ɭ�ɣ�������˹�������ɵ£���������˹�գ�����ʥ�ն������������أ����ֿ�ɭ����ǰ�棺����˹-���գ�����Ľ��ڣ���ά���ɣ�RB���������������-����˹��˹ͼ���أ� </p>\n  <p> ����������15�������ڵ¼�����������7�����԰���Ľ��ڣ�������3������Ӣ����2���������ף�2�����Է��ף�1��������ף�����������ж�Ա��ѡ��</p>\n",
				"news_6"," "));
		
		list.add(new News(2," ����͸18064��ͷ���տ� ����57.61����ʷ�¸�",
				"<p>����һ������ʴ���͸ ��18064�ڿ�����һ�Ƚ�ȫ���������С�����ȫ������2.24��Ԫ�����ڳＯ�����8098��Ԫ������������ʴ���͸����������57.61��Ԫ���ٴ���ʷ�¸ߡ� </p>\n  <p>ǰ��������С�Ż� </p>\n <p> ��ʴ���͸18064��ǰ���������š�01��03��04��11��29����������������Ϊ��02��04����ǰ����0����ͷ������ȿ���3ö����01���Ǽ��4�ں󿪳�����03��04����������ϣ����С�03���Ǽ��8�ڿ�������ƫ����룬��04�����Ǽ��2�ڿ��������������5�����ǵ��������࣬�������ź��룻��1����ͷ����2����ͷ������1ö���룬��11���Ǽ��5���ٶ����࣬��29�����Ǽ��3�����࣬ǰ����3����ͷ����տ���������02��04������ȫСȫż��ϣ���02���Ǹ������࣬��5�����ǵ����ο�������04�����Ǽ��5�ڿ�����</p>\n  <p>18064�ڿ�������ʴ���͸��������5587���Ԫ���ɿ���ǰ��57.05��Ԫ����������57.61��Ԫ������3��ά����57��Ԫ�����ϣ�Ҳ�ٶȴ�������ʷ�¸ߡ���������6��6�գ�����������ʴ���͸��18065�ڣ��л����ٴγ���󽱣���ʱ2Ԫ����Ͷע��߿���1000��Ԫ��3Ԫ׷��Ͷע��߿���1600��Ԫ�����ѹ����Ѳ�Ҫ����Ͷע���ᡣ���й������ ��ΰ�� </p>\n",
				" "," "));
		list.add(new News(2,"��������һ��Ǯû������35�� �н���Ʊ�ع� ",
				"<p>5��29�գ������ĵ��ٴδ����н�ϲѶ����һ������͸������ƾ��һ��336Ԫ��8+3��ʽƱһ�ٶ��18061�ڵĶ��Ƚ������񽱽�355240Ԫ����������Ʊ��ֵ����͸������ʴ���͸ ���н����򵥡����ʼ�ĵ�һ�ڣ����ø�ʽ��8+3��Ͷע����͸��ֻҪ�н����ͷ�Ͷע����ˣ������н�Ʊ�൱��һ��Ǯ������������35��Ĵ󽱡� </p>\n  <p>���߲ɷ���һ������ʱ��һλ�н����������������գ�����Ц�⣬���ĵ�˵�������˲��������ˣ�����ӭ���˴󽱣���Ȼ���Ǿ޶�𣬵������Ǻܿ��ģ������⼸������Ļ����ÿ�춼���״򲻶��ĸ��ţ��μӺ��������������ˣ����гɾ͸У������ر��лҵ��С�֣����ڲ���Ϊ������ʵ�������ˣ����������ģ���Ҳ�������ϵ��ز��ˣ�����Ҫ�չ�������Ҫ��ע��������ˣ�����©����һ����ȷʵ�����ף����Ƕ��ܸм������� </p>\n  <p> �����н��ı��󣬻���Ͷעվҵ���ǵ����ڸ���������С��ҵ��ʱ�������۾��Ǻ��׵ġ�ԭ�����׸ող��ţ��������˺��˼��ˣ�����ͣ��ص������˵�����ֻ���Ϣһֱ��ͣ�����ǲ������Ĳ����Ƿ����ġ����ڶ�����˵��������ʱ�ڣ������Ҳ��ܹ������������Ƕ��ҵ����Ρ����������ң��еĴ�Զ�ؼݳ���������Ҫ�����Ǹ����Σ�Ϊ�ľ���������غ����Σ���С����ʵ�޻��Ļ�����������������������������ݣ�</p>\n",
				"news_8"," "));
		list.add(new News(2,"�������˳�㹺�ʣ�С��ʽ��˫ɫ��691832Ԫ�� ",
				"<p>˫ɫ���2018060�ڿ�����ɽ���г����Ƚ�10ע������4ע���������б���·��ֱһ�����ű��Ϊ37110142�ĸ�����Ʊ���۳����� </p>\n  <p> 5��28�գ������ڶ��죬����37110142���Ȼ���������˭��ô���˵�ʱ�򣬴󽱵��������������գ����н�Ʊ�����˸������Ķҽ��ҡ�</p>\n <p>�ݸ��������ܣ��Լ���һλ�ϲ��ѣ������˫ɫ������䲻�����£�ƽʱϲ����ѡ�����Լ��������ķ�Χ֮�ڣ�ÿ�ڱ�����˫ɫ������˷�˿����ȻС�����ϣ���Ҳδ�й��󽱡� </p>\n  <p> 5��27�����죬������Ҫ���г���ˣ�һ�뵽37110142�����г��Աߣ�����·�������ڼ�����д����������04��08��13��25��30��31��������ԥ��һ�£�ѡ��07��08��09��11����ţ����һ������ʽ��37110142ҵ��������������Ц��˵�����ϸ�������β���ѡ����������������һЦ��������һ�ɲ������⽩��������Ͷע��ʽ��û׼Ҳ�ܻ�����������û�뵽���汻�Լ�˵���ˣ�</p>\n",
				"news_9"," "));
		
		list.add(new News(3," ������13����3������ͣ�� �ȵ�!��������̫����",
				"<p> ��������6��5�ձ�����</p>\n  <p>����ʱ��6��4�գ��й�U23���Ҷӽ�����һ����������4-2սʤ���ױ���U23�ӣ������и�׼��÷�����ȡ�Ҧ���ɵ��䡢�������������ţ���ȷ����ȵ��й�U23���ʱ��ע���������У�����2�� </p>\n <p> ���˷������ʱ�̱��ֲ��������⣬�����U23˫�Ϲ��ţ����Ժ��ĵ˺��ı���ͬ�����˾��ģ��׷������������ϰ볡13�����ھ�Ȼ�����������������ĵ�ͣ��ʧ��</p>\n  <p>������22���ӣ����ױ��Ƕ�Ա��Χ����������˺���ӭ����ͣ�������˷��ص�����£�����Ȼֱ�ӽ���ͣ���˱��ߣ�֪���Լ�������ʧ��ĵ˺���Ҳ�������ûڲ��ѡ� </p>\n",
				"news_10"," "));
		list.add(new News(3,"Ӣ����1�������籭֮�ף�100%Ӣ�����죬��ϲ���ǳ�? ",
				"<p> ��������6��5�ձ�����</p>\n  <p>���գ�����ý�幫��һ�����ݣ����籭32����Ա�ڱ�������Ч���������У����б�����ߵ���Ӣ�������ﵽ�˾��˵�100%��Ҳ����˵����˹���ص�23�����մ�������������Աȫ��������Ӣ�������� </p>\n  <p> ��Ӣ���������������Ž���������(˹�п˳�)��Ƥ�˸���(������)������(������)������������ŵ��(������)����ϣ��(�ж���)���ƶ�-��˹(����)��������(��˹�س�)����˹(�ȴ�)��˹ͨ˹(����)������Ƥ��(�ȴ�)���ֿ�(����)����ʲ��-��(����)�����г�������(�ȴ�)���¶���(����)������(�ȴ�)�����ɭ(������)���ּӵ�(����)�����ͼ˹-���(ˮ����)��ǰ�棺����(�ȴ�)����ʲ����(����)��˹����(����)���߶���(��˹�س�)��ά������(��ɭ��)	</p>\n  <p> Ӣ�����Ĵ������У��ȴ̳�Ϊ���Ӯ�ң�����5����ѡ������˫�۸���4����ѡ������������2�ˡ���Ӣ�����⣬��Ա�ڱ�������Ч�������ڶ��ߵ��Ƕ���˹��ɳ�أ��ﵽ91%��Ҳ����ȫ�ӽ�2�˷Ǳ�������Ч�����������͵¹��ı���������Ա����Ҳ�ܸߣ��ֱ�Ϊ74%��65%��ֵ��һ����ǣ��������ڼӶ���һ��Ч��������������������������ӵ�ĥ���Ѷȡ�</p>\n",
				"news_11"," "));
		list.add(new News(3,"�������� ����Ҳ�����籭��1����!��16�� ��ʤ���� ",
				"<p>��������6��5�ձ����� </p>\n  <p>ŷ�������ں󣬻�������������������2018�����籭�У�����ȴ�����ǵ�һ���š�����˹����ָ�������ǹ���16����Ա�μ����籭�����ǳ�Ϊ������Ա���ľ��ֲ��� </p>\n <p>������16����Ա���ֱ�Ч����8֧���Ҷӡ������޺Ͱ����ŵ��ǰ���͢�ˣ�������͵²�����Ϊ����ʱЧ��������˹�������塢�Ѷ��ϵ���ºͰ���ɭ�ǰ������ţ��ֿˡ�˹ͨ˹��˹���ֺ͵¶�����Ӣ�������š��ŵϡ����ల�����ɶ���-ϯ���ߺʹ���-ϯ���ߣ���ֱ𽫴����������¹�������������������ս���籭�� </p>\n  <p>���������籭������������Ϊ15�ˡ��������޺�������Ϊ������ս���������桢Ī������Ϊ���޵��ǳ�ս�����߹��������ǡ���˹��˹����Ī˹����ɭ���º���˹�������������š�����˹�������ڡ�����˹�����������C�ޣ���ֱ��Ǹ�˹����ӡ��������¹���Ħ�������������š� </p>\n",
				"news_12"," "));
		
		list.add(new News(4," ������Ժ���������� �󺫺��ջ᳤���˻�������ŭ",
				"<p> ��ԭ���⣺������Ժ���������� �󺫺��ջ᳤���˻�������ŭ��</p>\n  <p>������6��5�յ� ���գ������׶����뷨Ժ�ܾ��˾����Դ󺫺��ջ᳤�����������ľв������룬������4�������ͷţ���������Ǹ�������ƺ�����ƽϢ�������ڵ�ŭ�� </p>\n <p> �ݡ�����ʱ�����������󺫺��ջ᳤������ķ�����������һ(4��)��ϯ�˷�ͥ��֤�ᣬ��������������ְȨŹ���ˣ���Ժ���Ƿ���׼�����ľв���������������</p>\n  <p> �����ƣ������������ܾ����й�ָ�صĺ������ⷢ���κ����ۡ����׶�����ط���Ժ��ܾ��˾������������в��������Ҫ�������������Ӿ��ֻ��͡�</p>\n",
				"news_13"," "));
		list.add(new News(4," �����գ��ؽ���������ش��¼����� ������Ŀ�Դ�",
				"<p>��ԭ���⣺�����գ��ؽ��������Ϊ�ش��¼����� ������Ŀ�Դ��� </p>\n  <p> ������������������ʱ��5�գ������շ����ٴ��ᵽ�˳�����ᡣ���ƣ����볯�����¼��µĻ�����ϣ����Ϊ�ش�(�¼�)�Ŀ���...������Ŀ�Դ�!��</p>\n <p> 4�գ��׹����ŷ�����ɣ��˹�����ŷ������ϳƣ����ؽ�ᡱ���ڵ���ʱ��6��12������9�����¼��¾��С� ɣ��˹��ʾ��Ŀǰ�����쵼�˷��ĳﱸ�������ڼ���������̸�д������ڳ����߾����ŵ�Ǿ�������̸��Ϊ���ؽ�ᡱ������׼����</p>\n  <p> ��������ͳ�������볯���쵼�˽�����6��12�����¼��¾��С��ؽ�ᡱ�������һ�ܣ��������¼��µ���ǲ�������ö�����ĺ��ڼ����ǵ�ϸ�ڡ�</p>\n",
				"news_14"," "));
		list.add(new News(4,"�¼��»��ر��� ��ҾƵ��ɡ��ؽ�ᡱ���� ",
				"<p> ԭ���⣺�¼���ʥ��ɳ��Ϊ�ر������������Ƶ��ɡ����ػᡱ������</p>\n  <p> �����������Ƶ�֮���¼���������Ϊ�����ػᡱ����һ�顰�ر�������</p>\n <p> ���¼��¡������籨��6��5�ձ������¼���ʥ��ɳ��Sentosa�������ڡ����ػᡱ�����ڼ䱻����Ϊ���ر������������ڡ�������Χ���ڵĿ������Ƶ��Ϊ�����ػᡱ�᳡�Ŀ����Խ�һ����ߡ�</p>\n  <p>�����ƣ��¼�������������һ������ͨ���гƣ���6��10����14��֮�䣬��ʥ��ɳ�����ֵ�����Ϊ���ر�������������Χ�����ڿ������Ƶ꣨Capella Singapore��һ���� </p>\n",
				"news_15"," "));
		
		list.add(new News(5,"��ѡ��ίdiss�ܽ��ף����¸�������������û���� ",
				"<p>��������6��5�ձ��� 6��5�����ϣ�������΢�����ı��ϳƣ��ڡ��й��¸�������ѡ�ֳ���һλ��ί��Ȼdiss�ܽ��ס����Ҫ�����Ļ������鲻Ҫ���ܽ��׵ĸ裬��Ϊû��ʲôӪ����������󣬲����������ܲ�½ΰ�Ʋ�ȷ�������Ƿ��Ǹý�Ŀ�ĺ�ѡ�ֳ�����ʾ���ڵ����С��ոս�Ŀ��ٷ�΢���������ƣ���Ŀ���յ����ѷ���������չ���ڲ��Ų飬����ʵ����Ƶ�еġ���ѡ����롶�й��¸�������Ŀû���κι�����Ҳ���ǽ�Ŀ����Ȩ�ٰ졣��ǿ���ӡ��������������ø���������Ŀ�����ܽ��׵�ʦ���������õĺ�����ϵ������꣬Ҳʮ���Ƴ��������������Ŀ�黹��ʾ�������κ��˺��ܽ��׵�ʦ�͡��й��¸�������Ŀ���˺��£����ǽ����������̬�ȣ�������׷���������ε�Ȩ���� </p>\n  <p>����ԭ�ģ� </p>\n <p>�����賿�������������Ϸ�����Ƶ���ơ��й��¸�������Ŀ��ѡ��ίڮ������Ŀ��ʦ�ܽ��ף�Ӱ��ʮ�ֶ��ӡ���Ŀ���յ����ѷ���������չ���ڲ��Ų飬����ʵ����Ƶ�еġ���ѡ����롶�й��¸�������Ŀû���κι�����Ҳ���ǽ�Ŀ����Ȩ�ٰ졣�����κ��˺��ܽ��׵�ʦ�͡��й��¸�������Ŀ���˺��£���Ŀ�鶼�����������̬�ȣ�����������ɵ�Ȩ���� </p>\n  <p> </p>\n",
				"news_16"," "));
		list.add(new News(5," СS�˳����޸� ��٩��elephant dee�ص��������",
				"<p> ��������6��5�ձ��� 6��5���賿��СS��΢��ɹ��һ����Ƶ����Ƶ����˵�����������ޣ��ͻ���볪һ�׸衣�����ű㼫������е��˳�������Ц�����棬ʮ���˷ܡ�֮ǰ��������΢��ɹ��һ����Ƭ�����ģ��������ˣ����ó�����</p>\n  <p> ���ѵ�٩������elephant dee�ص�������磡�������Ƿ��޳�����õĻ���Ů�ǡ���</p>\n <p> </p>\n  <p> </p>\n",
				"news_17"," "));
		list.add(new News(5,"�ź�ů�ĸ��Jasper��лл���Ϊ�ҵĺ����� ",
				"<p>��������6��5�ձ��� �����ý�屨�������������ȱ����ڵ����ӽ�Ŀ��һ���ǡ������ǳ���3�����������ڵ�Ů�ǻ�˼��ͬ�����źߣ������裩�Ļ��������ǿ���Ц������ܰ������һ������������ϲ���֣���һ�����д�Ҷ���ϲ���ĳ�С������Jasper���֣��Դ�֮ǰ���꡶�ְ�ȥ�Ķ�5���󣬴�Ҷ�������Jasper�����Լ����������Ѷ�������������� </p>\n  <p>Ƭ�н�����˼�����źߣ��������ĸ������ѣ�����˵лл�����ź���أ���Jasper�������ź߼���Jasper����Ƶ�г��֣��ź߷ǳ����ģ�Jasper�����̷�����߸��ź߿��������и�ipad����������ν�յ���Ϸ����֮��Jasper�����˸�������߸��ź߿����ź߼����������䣬�����ó��Լ��Ĵ������������ͣ������У���������������������������ߴ��ƴ��֮��Jasper����ȥ�ø����ˣ��ź�������˵������Ҳ�С�������ȥ�ã����������������նԴ򣬶����Ц�ǻ�˼��ͱ��һ���ֻ��ܣ��������ֵܸ��ն�ս��������Ҷ�˵�����������Ǻø�Ц�� </p>\n <p> </p>\n  <p> </p>\n",
				"news_18"," "));
		
		list.add(new News(6,"��15ս�����ҹ���� ý��:�Ѷ��ǰ��������5�� ",
				"<p>��ԭ���⣺��15ս�����ҹ���� ý�壺�Ѷ��ǰ��������5���� </p>\n  <p>5��24�գ����ӽ�Ŀ�����˼ߣ�15���ػ����������Ͻ���ҹ���𽵵Ļ��档�ⲻ����־���й�������������Ϊ������ļ������ս��ػ�ҹ���𽵼����Ĺ������У�����Ҫ���ǣ�����־���й��Ľ��ػ�����ѳ����߱�ȫ�����ս����������˵�����ػ��ܷ��ں�ĸ��ҹ���𽵣��Ǻ���һ�����ҵĺ�ĸս��Ⱥ�����Ƿ��㹻ȫ����Խ�ʯ����˿��������ػ�ҹ���𽵣����Ѷȱ�Ȼ�ǳ��ߡ�</p>\n <p>�����ж��ѣ�����ȷ���������콢�ػ��������ƶ��ĺ�ĸ�ϵ��Ѷ���1�������ھ�ֹ�ĺ�ĸ�ϵ��Ѷ���2����ô�����Ͻ������ƶ���ĸ�ϵ��Ѷ�������5����ʵ�ϣ����ػ�ҹ���𽵷ǳ����ѣ������Ѹ����µ���Σ�ա���ҹ�����������Ѻ�Σ�������ڽ��ػ����䣬��������ɡ� </p>\n  <p> </p>\n",
				"news_19"," "));
		list.add(new News(6," ӡ���һ�5����������װ�����Ƚ�ˮ׼�м�ʮ����",
				"<p>��ԭ���⣺ӡ���һ�5����������װ�����Ƚ�ˮ׼�м�ʮ���ࣩ </p>\n  <p>������������6��5�ձ��� ����ʱ����Լ���� ����ۡ�3�գ�ӡ�ȳɹ������ˡ��һ�-5��������������ӡ��ý������͸¶����Ϣ��ʾ���ٽ���һ�γɹ����䣬�õ�������ʽװ�����ӡ�ӡýǿ�����õ���̶��ɺ����й������ɸ���ŷ�ޡ���������ӡ�ȹ����ĵ�����ս���������������һ�-5�����»�ֻ������һöԶ�̵����������������Ƚ�ˮƽ���м�ʮ��Ĳ�ࡣ </p>\n <p>��һ�ξ�ȷ�Ľ̿���ʽ���䡱 </p>\n  <p> �ݡ�ӡ��ʱ����4�ձ�����������Ϣ��ʿ�ƣ����һ�-5�����������ٽ���һ�γɹ������飬�ͽ��߱�װ��ӡ�Ⱥ�ָ����������ĵ�½��ս�Բ���˾��������������ƣ����һ�-5������Я���˵�ͷ����̿��Ը����й����ͻ�˹̹��ŷ���Լ����޲��ֵ����������ƣ����ں������͵Ŀ�ѧ����˵����������6������ɹ�ʱ���ǻ����ʱ���ˡ�һλ�����ѧ��˵����������������ǡ��һ�-5������֮ǰ������֮һ������һ�ξ�ȷ�Ľ̿���ʽ���䣬ÿһ��Ŀ�궼�ﵽ�ˡ��������ƣ��������͵Ĺ���ʵ���ң��Լ��������ա�����ķ�����ۺ��塢�Ƚ�ϵͳʵ���Һ͹����о���չʵ���Ҳ����ˡ��һ�-5�����������ơ�</p>\n",
				"news_20"," "));
		list.add(new News(6,"����˹����֮��Ǳͧ���䵼����������� ",
				"<p>��ԭ���⣺��ĩ�ղ��š���������֮��Ǳͧ���䵼����������֣� </p>\n  <p> �ο���Ϣ��6��5�ձ��� �ݶ���˹���۵㱨��5��23�ձ����ƣ�5��22�գ��������ɹ���λ�ڰ׺��ġ���������³�����ţ�����֮����ͧ��ս�Ժ�Ǳͧ��������4ö��Բ���������롰�����ߡ���Ǳ���޼ʵ�����ȫ������λ�ڿ���Ӱ뵺�г���Ԥ��Ŀ�ꡣ���Ƕ����״��ڱ���֮�񼶺�Ǳͧ��������˶�ĵ������������������Ǳ�䵯��������˵���Ǽ������Ƿ�߱�ʵս������Ψһ�ֶΡ���ô������Ǳͧ������������ѵ�����ѵ������Ŀ��Ϊ�Σ����������������Щ��ࣿ���ľʹ�չ�������</p>\n <p>ˮ�������Ѷȴ� �Կɿ���Ҫ��� </p>\n  <p>������Ǳͧ�н������������Ḧ�ٿ¶ԡ��۵㱨�����߱�ʾ����4ö��������֤���ˡ���������³�����ź�Ǳͧ����ϵͳ�͡�Բ�������������Ŀɿ��ԣ��Լ���ͧ��ս��ӵĹ���Э���ԡ�����ӵ���ĳ��Ŀ�귢��5��6ö������������ǿ�����ɡ���Ҳ֤���˸�Ǳͧ�Ѿ߱��ϸߵ�ս���ȡ��� </p>\n",
				"news_21"," "));
		
		
		return list;
	}
}