/**
 * FileName: Member
 * Author:   Dennis
 * Date:     2018/2/28 18:01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Dennis
 * @create 2018/2/28
 * @since 1.0.0
 */
public class Member {
    
    private List<String> names;

    private Map<String,String> phones;

    private Properties infos;

    public Properties getInfos() {
        return infos;
    }

    public void setInfos(Properties infos) {
        this.infos = infos;
    }

    public Map<String, String> getPhones() {
        return phones;
    }

    public void setPhones(Map<String, String> phones) {
        this.phones = phones;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Member{" +
                "names=" + names +
                ", phones=" + phones +
                ", infos=" + infos +
                '}';
    }
}
