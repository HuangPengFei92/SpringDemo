/**
 * FileName: SpringLab
 * Author:   Dennis
 * Date:     2018/2/28 16:45
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br> 
 * 〈com.springDemo.test〉
 *
 * @author Dennis
 * @create 2018/2/28
 * @since 1.0.0
 */
public class SpringLab {
    public static void main(String[] args) {
        ApplicationContext atx = new ClassPathXmlApplicationContext("spring-config.xml");

//        Dept dept = atx.getBean("dept",Dept.class);

//        System.out.println(dept);

        Member m = atx.getBean("member",Member.class);

        System.out.println(m);

    }
}
