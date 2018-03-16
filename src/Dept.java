/**
 * FileName: Dept
 * Author:   Dennis
 * Date:     2018/2/28 17:05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Dennis
 * @create 2018/2/28
 * @since 1.0.0
 */
public class Dept implements Serializable {

    private Integer deptNo;
    private String deptName;
    private String loc;

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    /*public Dept() {
        System.out.println("Dept.class");
    }*/

    /*public Dept(Integer deptNo, String deptName, String loc) {
        this.deptNo = deptNo;
        this.deptName = deptName;
        this.loc = loc;
    }*/

    @Override
    public String toString() {
        return "Dept{" +
                "deptNo=" + deptNo +
                ", deptName='" + deptName + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
