import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.dependency.CRFDependencyParser;
import com.hankcs.hanlp.seg.CRF.CRFSegment;
import com.hankcs.hanlp.seg.Segment;
import com.hankcs.hanlp.seg.common.Term;

import java.util.List;

public class Try {
    public static void main(String args[]){
//        String tt="2017年7月9日，“小天鹅”斯诺克世界杯在无锡落幕。中国A队和英格兰队在决赛中相遇。决赛中，双方战至决胜局，丁俊晖再次成为英雄，帮助中国A队赢下决胜局，连追3局逆转击败英格兰，夺得世界杯冠军！　　1、决赛：中国A队 ";
//        String tt="36氪首发 | 巴图鲁获1亿美元C轮融资，华平投资领投，原有投资方钟鼎创投跟投";
//        String tt="让科技公司更快、更 Geek 地招聘程序员，HackerEarth 获 450 万美元融资";
        String tt="智能招聘公司Beamey获得投资100元，为候选人建立一套CRM管理系统";
        Segment segment = HanLP.newSegment().enableOffset(true).enableOrganizationRecognize(true);
        List<Term> list =segment.seg(tt);
//        Segment segment = new CRFSegment().enableNameRecognize(true);
//        List<Term> list = segment.seg(tt);

        System.out.println(list);

        System.out.println(HanLP.parseDependency(tt));
//        System.out.println(CRFDependencyParser.compute("7月9日傍晚，河北保定遭暴雨大风冰雹袭击。"));
    }
}
