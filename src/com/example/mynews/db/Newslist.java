package com.example.mynews.db;

import java.util.ArrayList;

import com.example.mynews_bean.News;

public class Newslist {
	
	static ArrayList<News> list = new ArrayList<News>();
	
	public static ArrayList<News> initNews(){
		
		list.add(new News(0,"派舰过台湾、军机抵南沙 美国放这些传闻想唬谁？ ",
				"<p>（原标题：派军舰过台湾海峡，B-52飞抵中国南沙，放这些传闻的美国想唬谁？） </p>\n <p> 台海这个地方尚未形成中美军事对峙，希望那一天不会到来。但是一旦出现那种糟糕局面，中国肯定无处可退，为维护国家主权和尊严不惜付出任何代价。</p>\n  <p>据西方媒体报道，美国正在考虑派遣一艘军舰通过台湾海峡。如果消息属实，意味着华盛顿准备采取更多行动来展示其对华施压的姿态。在这个消息传出的同一天，美国两架B-52轰炸机被报道从关岛起飞抵近中国南沙群岛，但是随后美国太平洋空军发言人又否认那两架B-52飞到了南沙附近。 </p>\n",
				"news_1","2018/06/09\t16:18"));
		list.add(new News(0,"“外交部回应向澳洲航空施压要求其改变涉台标识”",
				"<p>（原标题：2018年6月5日外交部发言人华春莹主持例行记者会）</p>\n <p>问：近日澳大利亚外长批评中国向澳洲航空公司施压，要求其改变网站涉台标识，称私营企业经营活动不应受政治压力干扰。中方对此有何评论？ </p>\n  <p> 答：我注意到有关报道。世界上只有一个中国，香港、台湾、澳门从来都是中国的一部分，这是客观事实、基本常识，也是国际社会的普遍共识。相关问题不是普通的程序性或技术性问题。中方有关部门通知体现了中国政府在一个中国原则上的一贯、坚定立场，有关要求合理合法，绝不是什么“政治干预”或者“政治压力”。任何在中国经营的企业都应遵守中国的法律法规，尊重和遵守一个中国原则，这是最起码的遵循。</p>\n",
				"news_2","2018/06/09\t16:18"));
		list.add(new News(0," 95后女大学生“独闯”沙漠 穷游伊朗半月仅花600元",
				"<p>（原标题：95后女大学生“独闯”塔克拉玛干沙漠 穷游伊朗半月仅花600元） </p>\n <p>穷游对于许多旅行爱好者来说，一直是个颇具吸引与挑战的旅行方式，然而，四川外国语大学大三女生陈睿蕾却利用寒暑假的时间，独闯塔克拉玛干沙漠、斯里兰卡、伊朗穷游，在路上经历成长。昨晚，陈睿蕾与成都晚报记者分享了她的穷游心得，“旅行路上我会遇到各种各样的人和事，他们不仅开阔了我的思维和眼界，更让我明确了未来的目标和生活方向，以后，而穷游只理解成省钱太过片面，应该是内心穷成一张白纸，好容纳所有的经历。” </p>\n  <p> 陈睿蕾说，自己18岁上大一时，参加了一个国际志愿者的活动，去斯里兰卡，本着锻炼自己的初衷，便报了名。由于出行没有经验，加上有些初生牛犊的勇气，随身的行装并不多，“因为是志愿者活动，此次出行的经费是众筹来的，我们通过在一个相关平台写众筹信的方式，一周的时间筹集到了4000块，用于往返机票及住宿费，自己随身还带了几百块钱和银行卡。”</p>\n",
				"news_3","2018/06/09\t16:18"));
		
		
		list.add(new News(1,"15岁球员被机构标价3000万，经纪人私下签走送日本 ",
				"<p>在5月底结束的“熊猫杯”中，中国U19国青队首次夺得该项赛事冠军。成耀东率领的这支球队中，未满17岁的国青队跨级生何龙海让四川球迷感到非常陌生。 </p>\n  <p> 9岁时还只是在成都上足球训练班的何龙海，被东莞麻涌融易俱乐部总教练吴世和当作璞玉带走，经过七年的培养，何龙海已经被视为国内2001年龄段中出类拔萃的球员。</p>\n <p> 被诸多国内豪门垂涎的何龙海，虽然在“熊猫杯”报名表上的注册俱乐部仍是东莞麻涌，但实际他在今年春节后就再也没有归队，而是被经纪人带去了日本，加盟湘南海洋的梯队。</p>\n  <p>目前，东莞麻涌俱乐部仍在和经纪人协商这起“转会”——这样的事情，在中国足坛已成一种普遍现象，或者说乱象。 </p>\n",
				"news_4","2018/06/09\t16:18"));
		list.add(new News(1,"巴萨“防盗门”升级!首发6人违约金30亿欧 谁敢动 ",
				"<p>去年夏天，内马尔出走，这让宇宙队非常狼狈不堪，因为巴黎绕过巴萨，直接用激活违约金方式带走了巴西人，支付的转会费是2.22亿欧元。正所谓“吃一堑长一智”，在内马尔离开后，巴萨彻底领悟到违约金的重要性，在最近续约乌姆蒂蒂的时候，双方设定的违约金就达到了5亿欧元，而《马卡报》盘点了巴萨队内违约金的情况，最贵的六人，价值达到30亿欧元！ </p>\n  <p>在内马尔离开后，巴萨续约了很多的重臣，其中就包括梅西，阿根廷人的合同违约金是7亿欧元，而皮克的违约金达到了5亿欧元，另外，罗贝托和乌姆蒂蒂的违约金同样是5亿欧元，都是其它豪门挖不起的价格。 </p>\n ",
				"news_5","2018/06/09\t16:18"));
		list.add(new News(1,"小新在!罗伊斯在!但丢了不合群的萨内 德国想卫冕! ",
				"<p> 网易体育6月5日报道：</p>\n  <p>网易新闻独家签约的德国国家队于北京时间6月4日公布了世界杯最终的23人大名单，萨内落选引起轩然大波。这个英超最快的男人为何会被勒夫冷落？德国队的主力框架和战术打法又会怎样布置？ </p>\n <p>德国队23人大名单如下：门将：诺伊尔（拜仁慕尼黑）、特尔施特根（巴塞罗那）、特拉普（巴黎圣日耳曼）；后卫：胡梅尔斯（拜仁慕尼黑）、博阿滕（拜仁慕尼黑）、聚勒（拜仁慕尼黑）、吕迪格（切尔西）、基米希（拜仁慕尼黑）、金特尔（门兴）、赫克托（科隆）、普拉滕哈特（柏林赫塔）；中场：赫迪拉（尤文图斯）、克罗斯（皇家马德里）、京多安（曼城）、鲁迪（拜仁慕尼黑）、戈雷茨卡（沙尔克04）、厄齐尔（阿森纳）、罗伊斯（多特蒙德）、德拉克斯勒（巴黎圣日耳曼）、布兰特（勒沃库森）；前锋：托马斯-穆勒（拜仁慕尼黑）、维尔纳（RB莱比锡）、马里奥-戈麦斯（斯图加特） </p>\n  <p> 这份名单里，有15人来自于德甲联赛，其中7人来自拜仁慕尼黑，另外有3人来自英超，2人来自西甲，2人来自法甲，1人来自意甲，五大联赛皆有队员入选。</p>\n",
				"news_6","2018/06/09\t16:18"));
		
		list.add(new News(2," 大乐透18064期头奖空开 奖池57.61亿历史新高",
				"<p>本周一晚，体彩大乐透 第18064期开奖，一等奖全国无人命中。当期全国销售2.24亿元，单期筹集公益金8098万元。开奖过后，体彩大乐透奖池攀升到57.61亿元，再创历史新高。 </p>\n  <p>前后区都是小号火爆 </p>\n <p> 体彩大乐透18064期前区开出奖号“01、03、04、11、29”，后区开奖号码为“02、04”。前区“0”字头号码大热开出3枚，“01”是间隔4期后开出，“03、04”是连号组合，其中“03”是间隔8期开出的稍偏冷号码，“04”则是间隔2期开出，并且在最近5期内是第三次亮相，属于热门号码；“1”字头、“2”字头各开出1枚号码，“11”是间隔5期再度亮相，“29”则是间隔3期亮相，前区“3”字头号码空开。后区“02、04”则是全小全偶组合，“02”是隔期亮相，近5期内是第三次开出，“04”则是间隔5期开出。</p>\n  <p>18064期开奖后，体彩大乐透奖池上涨5587万多元，由开奖前的57.05亿元，攀升到了57.61亿元，连续3期维持在57亿元线以上，也再度创下了历史新高。本周三（6月6日）晚开奖的体彩大乐透第18065期，有机会再次冲击大奖，届时2元基本投注最高可中1000万元，3元追加投注最高可中1600万元，提醒广大彩友不要错过投注机会。（中国体彩网 王伟） </p>\n",
				" ","2018/06/09\t16:18"));
		list.add(new News(2,"威海彩民“一分钱没花”中35万 中奖彩票曝光 ",
				"<p>5月29日，威海文登再次传来中奖喜讯，有一个大乐透合买团凭借一张336元的8+3复式票一举夺得18061期的二等奖，揽获奖金355240元。此张幸运票正值大乐透“买体彩大乐透 你中奖我买单”活动开始的第一期，采用复式“8+3”投注大乐透，只要中奖，就返投注金。因此，这张中奖票相当于一分钱不花，就中了35万的大奖。 </p>\n  <p>笔者采访这一合买团时，一位中奖彩民王先生（化姓）满脸笑意，开心地说：“好运不负有心人，终于迎来了大奖，虽然不是巨额奖金，但是我们很开心，我们这几个合买的伙计们每天都是雷打不动的跟号，参加合买。这期终于中了，很有成就感！我们特别感谢业主小阎，期期不落为我们落实合买事宜，很有责任心，人也善良，老爹重病了，她又要照顾老人又要关注我们这帮人，生怕漏了哪一个，确实不容易，我们都很感激她！” </p>\n  <p> 彩民中奖的背后，还有投注站业主们的辛勤付出。见到小阎业主时，她的眼睛是红肿的。原来父亲刚刚病逝，她安顿了好了家人，马不停蹄回到店里。她说：“手机信息一直不停，都是参与合买的彩民们发来的。现在对我来说虽是特殊时期，但是我不能辜负彩民朋友们对我的信任。他们相信我，有的从远地驾车而来，我要对他们负责任，为的就是这份尊重和信任！”小阎朴实无华的话语，传递了满满的正能量。（苏丽妮）</p>\n",
				"news_8","2018/06/09\t16:18"));
		list.add(new News(2,"得主买菜顺便购彩，小复式中双色球691832元奖 ",
				"<p>双色球第2018060期开奖，山东中出二等奖10注，其中4注花落日照市北京路市直一区西门编号为37110142的福利彩票销售场所。 </p>\n  <p> 5月28日，开奖第二天，正当37110142内热火朝天讨论是谁这么幸运的时候，大奖得主福先生（化姓）持中奖票来到了福彩中心兑奖室。</p>\n <p>据福先生介绍，自己是一位老彩友，彩龄跟双色球的年龄不相上下，平时喜欢机选，在自己能允许的范围之内，每期必买，是双色球的铁杆粉丝。虽然小奖不断，但也未中过大奖。 </p>\n  <p> 5月27日这天，福先生要到市场买菜，一想到37110142就在市场旁边，正好路过，便在家随手写了六个红球04、08、13、25、30、31，蓝球犹豫了一下，选了07、08、09、11这个号，组成一组蓝球复式。37110142业主焦先生还开玩笑的说：“老福啊，这次不机选啦？”福先生哈哈一笑：“老是一成不变难免僵化，换换投注方式，没准也能换换运气！”没想到，真被自己说中了！</p>\n",
				"news_9","2018/06/09\t16:18"));
		
		list.add(new News(3," 恒大国脚13分钟3次灾难停球 等等!跟王燊超太像了",
				"<p> 网易体育6月5日报道：</p>\n  <p>北京时间6月4日，中国U23国家队进行了一场热身赛，4-2战胜纳米比亚U23队，比赛中高准翼梅开二度、姚均晟点射、张玉宁抢点破门，大比分领先的中国U23最后时刻注意力不集中，连丢2球。 </p>\n <p> 除了防线最后时刻表现不让人满意，国足和U23双料国脚，来自恒大的邓涵文表现同样让人揪心，首发出场的他在上半场13分钟内居然出现了三次漫不经心的停球失误。</p>\n  <p>比赛第22分钟，纳米比亚队员解围球出禁区，邓涵文迎上来停球，在无人防守的情况下，他居然直接将球停出了边线，知道自己出现了失误的邓涵文也是捂脸懊悔不已。 </p>\n",
				"news_10","2018/06/09\t16:18"));
		list.add(new News(3,"英格兰1数据世界杯之首，100%英超制造，该喜还是愁? ",
				"<p> 网易体育6月5日报道：</p>\n  <p>近日，国外媒体公布一项数据，世界杯32队球员在本国联赛效力比例排行，其中比例最高的是英格兰，达到了惊人的100%，也就是说，索斯盖特的23人最终大名单，所有球员全部来自于英超联赛！ </p>\n  <p> 附英格兰大名单：；门将：巴特兰(斯托克城)、皮克福德(埃弗顿)、波普(伯恩利)；；后卫：阿诺德(利物浦)、卡希尔(切尔西)、菲尔-琼斯(曼联)、马奎尔(莱斯特城)、罗斯(热刺)、斯通斯(曼城)、特里皮尔(热刺)、沃克(曼城)、阿什利-扬(曼联)；；中场：阿里(热刺)、德尔夫(曼城)、戴尔(热刺)、亨德森(利物浦)、林加德(曼联)、洛夫图斯-奇克(水晶宫)；前锋：凯恩(热刺)、拉什福德(曼联)、斯特林(曼城)、瓦尔迪(莱斯特城)、维尔贝克(阿森纳)	</p>\n  <p> 英格兰的大名单中，热刺成为最大赢家，共有5人入选，曼市双雄各有4人入选，利物浦则是2人。除英格兰外，球员在本国联赛效力比例第二高的是俄罗斯和沙特，达到91%，也就是全队仅2人非本国联赛效力，西班牙和德国的本国联赛球员比例也很高，分别为74%和65%。值得一提的是，瑞典和塞内加尔无一人效力本国联赛，这无疑增大了球队的磨合难度。</p>\n",
				"news_11","2018/06/09\t16:18"));
		list.add(new News(3,"少了萨内 曼城也是世界杯第1豪门!共16将 稍胜皇马 ",
				"<p>网易体育6月5日报道： </p>\n  <p>欧冠三连冠后，皇马开创了王朝。但在2018年世界杯中，皇马却并不是第一豪门。《阿斯报》指出，曼城共有16名球员参加世界杯，曼城成为贡献球员最多的俱乐部。 </p>\n <p>曼城这16名球员，分别效力于8支国家队。阿圭罗和奥塔门迪是阿根廷人，孔帕尼和德布劳内为比利时效力，热苏斯、达尼洛、费尔南迪尼奥和爱德森是巴西国脚，沃克、斯通斯、斯特林和德尔夫是英格兰国脚。门迪、京多安、贝纳尔多-席尔瓦和大卫-席尔瓦，则分别将代表法国、德国、葡萄牙和西班牙出战世界杯。 </p>\n  <p>皇马的世界杯国脚数量，则为15人。卡塞米罗和马塞洛为巴西出战，科瓦契奇、莫德里奇为克罗地亚出战，卡瓦哈尔、纳乔、巴斯克斯、拉莫斯、阿森西奥和伊斯科是西班牙国脚。纳瓦斯、瓦拉内、克罗斯、阿奇拉夫和C罗，则分别是哥斯达黎加、法国、德国、摩洛哥和葡萄牙国脚。 </p>\n",
				"news_12","2018/06/09\t16:18"));
		
		list.add(new News(4," 韩国法院拒下批捕令 大韩航空会长夫人获释引众怒",
				"<p> （原标题：韩国法院拒下批捕令 大韩航空会长夫人获释引众怒）</p>\n  <p>海外网6月5日电 近日，韩国首尔中央法院拒绝了警方对大韩航空会长夫人李明姬的拘捕令申请，李名熙4日晚被释放，并向公众致歉，但这似乎难以平息韩国公众的怒火。 </p>\n <p> 据《韩国时报》报道，大韩航空会长赵亮镐的夫人李明姬周一(4日)出席了法庭听证会，李明姬被控滥用职权殴打工人，法院对是否批准警方的拘捕申请做出决定。</p>\n  <p> 报道称，当天李明姬拒绝就有关指控的后续问题发表任何评论。而首尔中央地方法院则拒绝了警方对李明姬拘捕令的申请要求，李明姬当晚从警局获释。</p>\n",
				"news_13","2018/06/09\t16:18"));
		list.add(new News(4," 特朗普：特金会有望成重大事件开端 我们拭目以待",
				"<p>（原标题：特朗普：特金会有望成为重大事件开端 我们拭目以待） </p>\n  <p> 【环球网报道】当地时间5日，特朗普发推再次提到了朝美峰会。他称：“与朝鲜在新加坡的会晤有希望成为重大(事件)的开端...我们拭目以待!”</p>\n <p> 4日，白宫新闻发言人桑德斯在新闻发布会上称，“特金会”将于当地时间6月12日上午9点在新加坡举行。 桑德斯表示，目前朝美领导人峰会的筹备工作仍在继续，朝美谈判代表正在朝韩边境板门店非军事区会谈，为“特金会”做最后的准备。</p>\n  <p> 距美国总统特朗普与朝鲜领导人金正恩6月12日在新加坡举行“特金会”还有最后一周，美方在新加坡的先遣队正在敲定会议的后勤及礼仪等细节。</p>\n",
				"news_14","2018/06/09\t16:18"));
		list.add(new News(4,"新加坡划特别活动区 这家酒店或成“特金会”主场 ",
				"<p> 原标题：新加坡圣淘沙划为特别活动区，卡佩拉酒店或成“金特会”主场）</p>\n  <p> 继香格里拉大酒店之后，新加坡政府又为“金特会”划了一块“特别活动区”。</p>\n <p> 据新加坡《联合早报》6月5日报道，新加坡圣淘沙（Sentosa）地区在“金特会”举行期间被划定为“特别活动区”，坐落在“特区范围”内的卡佩拉酒店成为“金特会”会场的可能性进一步提高。</p>\n  <p>报道称，新加坡内政部长在一则线上通告中称，在6月10日至14日之间，将圣淘沙岛部分地区划为“特别活动区”。该区域范围集中在卡佩拉酒店（Capella Singapore）一带。 </p>\n",
				"news_15","2018/06/09\t16:18"));
		
		list.add(new News(5,"海选评委diss周杰伦？《新歌声》发声明称没关联 ",
				"<p>网易娱乐6月5日报道 6月5日早上，有网友微博发文爆料称，在《中国新歌声》海选现场，一位评委公然diss周杰伦“如果要弹唱的话，建议不要弹周杰伦的歌，因为没有什么营养……”随后，灿星制作副总裁陆伟称不确定此事是否是该节目的海选现场，表示正在调查中。刚刚节目组官方微博发声明称：节目组收到网友反馈后立刻展开内部排查，经核实，视频中的“海选活动”与《中国新歌声》节目没有任何关联，也并非节目组授权举办。并强调从“好声音”到“好歌声”，节目组与周杰伦导师建立了良好的合作关系深厚友谊，也十分推崇他的音乐理念。节目组还表示，对于任何伤害周杰伦导师和《中国新歌声》节目的人和事，他们将坚持零容忍态度，并保留追究法律责任的权力。 </p>\n  <p>声明原文： </p>\n <p>今日凌晨，有网友在网上发布视频，称《中国新歌声》节目海选评委诋毁主节目导师周杰伦，影响十分恶劣。节目组收到网友反馈后立刻展开内部排查，经核实，视频中的“海选活动”与《中国新歌声》节目没有任何关联，也并非节目组授权举办。对于任何伤害周杰伦导师和《中国新歌声》节目的人和事，节目组都将坚持零容忍态度，并保留诉诸法律的权力。 </p>\n  <p> </p>\n",
				"news_16","2018/06/09\t16:18"));
		list.add(new News(5," 小S嗨唱非洲歌 被侃：elephant dee回到精神故乡",
				"<p> 网易娱乐6月5日报道 6月5日凌晨，小S在微博晒出一段视频，视频中她说：“来到非洲，就会很想唱一首歌。”接着便极富节奏感地嗨唱起来，笑容满面，十分兴奋。之前，她曾在微博晒出一组照片，配文：到非洲了！看得出来吗？</p>\n  <p> 网友调侃道：“elephant dee回到精神故乡！”“怕是非洲唱歌最好的华人女星。”</p>\n <p> </p>\n  <p> </p>\n",
				"news_17","2018/06/09\t16:18"));
		list.add(new News(5,"嗯哼暖心告白Jasper：谢谢你成为我的好朋友 ",
				"<p>网易娱乐6月5日报道 据香港媒体报道，讲到近期热爆的内地亲子节目，一定是《妈妈是超人3》！皆因当中内地女星霍思燕同儿子嗯哼（杜宇麒）的互动，真是看到笑爆又温馨！继上一集天后容祖儿惊喜出现，这一集又有大家都很喜欢的陈小春儿子Jasper出现，自从之前播完《爸爸去哪儿5》后，大家都好想念Jasper，所以见到他，网友都大呼好想他啊！ </p>\n  <p>片中讲到霍思燕问嗯哼：“想打给哪个好朋友，跟他说谢谢？”嗯哼秒回：“Jasper！”当嗯哼见到Jasper在视频中出现，嗯哼非常开心，Jasper还立刻分享玩具给嗯哼看：“我有个ipad，现在玩变形金刚的游戏。”之后Jasper再拿了个恐龙玩具给嗯哼看，嗯哼见到都不服输，立马拿出自己的大恐龙出来，不停扮恐龙叫：“哗！哗！哗！”两个隔空玩具大比拼，之后Jasper再跑去拿个超人，嗯哼听到就说：“我也有。”又跑去拿，两个还激动到隔空对打，而最搞笑是霍思燕就变成一个手机架，看着两兄弟隔空对战，看到大家都说他们两个真是好搞笑！ </p>\n <p> </p>\n  <p> </p>\n",
				"news_18","2018/06/09\t16:18"));
		
		list.add(new News(6,"歼15战机完成夜间起降 媒体:难度是白天的至少5倍 ",
				"<p>（原标题：歼15战机完成夜间起降 媒体：难度是白天的至少5倍） </p>\n  <p>5月24日，央视节目公布了歼－15舰载机在辽宁舰上进行夜间起降的画面。这不仅标志着中国已跻身世界上为数不多的几个掌握舰载机夜间起降技术的国家行列，更重要的是，它标志着中国的舰载机编队已初步具备全天候作战能力。可以说，舰载机能否在航母上夜间起降，是衡量一个国家的航母战斗群能力是否足够全面的试金石。如此看来，舰载机夜间起降，其难度必然非常高。</p>\n <p>究竟有多难？打个比方：如果白天舰载机降落在移动的航母上的难度是1，降落在静止的航母上的难度是2，那么，晚上降落在移动航母上的难度至少是5。事实上，舰载机夜间起降非常困难，比困难更可怕的是危险。而夜间起降最大的困难和危险来自于舰载机降落，而不是起飞。 </p>\n  <p> </p>\n",
				"news_19","2018/06/09\t16:18"));
		list.add(new News(6," 印度烈火5导弹即将列装？距先进水准有几十年差距",
				"<p>（原标题：印度烈火5导弹即将列装？距先进水准有几十年差距） </p>\n  <p>【环球网军事6月5日报道 环球时报特约记者 张亦驰】3日，印度成功试射了“烈火-5”弹道导弹。而印度媒体最新透露的消息显示，再进行一次成功试射，该导弹将正式装备部队。印媒强调，该弹射程东可涵盖中国，西可覆盖欧洲。不过，从印度公布的导弹技战术性能来看，“烈火-5”恐怕还只能算是一枚远程弹道导弹，距世界先进水平还有几十年的差距。 </p>\n <p>“一次精确的教科书式发射” </p>\n  <p> 据《印度时报》4日报道，防务消息人士称，“烈火-5”弹道导弹再进行一次成功的试验，就将具备装备印度核指挥与控制中心的陆军战略部队司令部的条件。报道称，“烈火-5”可以携带核弹头，射程可以覆盖中国、巴基斯坦、欧洲以及非洲部分地区。报道称，对于海德拉巴的科学家来说，当导弹第6次试射成功时，是欢庆的时候了。一位资深科学家说：“星期天的试射是‘烈火-5’服役之前的任务之一，这是一次精确的教科书式发射，每一个目标都达到了。”报道称，海德拉巴的国防实验室，以及阿卜杜勒·卡拉姆导弹综合体、先进系统实验室和国防研究发展实验室参与了“烈火-5”导弹的研制。</p>\n",
				"news_20","2018/06/09\t16:18"));
		list.add(new News(6,"俄罗斯北风之神级潜艇齐射导弹可威慑对手 ",
				"<p>（原标题：“末日彩排”！俄北风之神级潜艇齐射导弹可威慑对手） </p>\n  <p> 参考消息网6月5日报道 据俄罗斯《观点报》5月23日报道称，5月22日，俄海军成功从位于白海的“尤里·多尔戈鲁基”号（北风之神级首艇）战略核潜艇上齐射了4枚“圆锤”（另译“布拉瓦”）潜射洲际导弹，全部命中位于堪察加半岛靶场的预定目标。这是俄军首次在北风之神级核潜艇上齐射如此多的导弹，而这种齐射对于潜射弹道导弹来说，是鉴定其是否具备实战能力的唯一手段。那么俄海军潜艇进行这种齐射训练的难点在哪里，目的为何，与美军相比又有哪些差距？本文就此展开解读。</p>\n <p>水下齐射难度大 对可靠性要求高 </p>\n  <p>俄海军潜艇中将阿纳托利·舍甫琴柯对《观点报》记者表示：“4枚导弹齐射证明了‘尤里·多尔戈鲁基’号核潜艇导弹系统和‘圆锤’导弹本身的可靠性，以及舰艇作战编队的工作协调性。如果接到向某个目标发射5至6枚导弹的命令，我们可以完成。这也证明了该潜艇已具备较高的战备度。” </p>\n",
				"news_21","2018/06/09\t16:18"));
		
		
		return list;
	}
}
