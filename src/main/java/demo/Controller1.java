package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Stepan Koltsov
 */
@Controller
public class Controller1 {

    @RequestMapping("/")
    @ResponseBody
    public String a() {
        return "hi there <a href='/throw'>throw</a>";
    }

    @RequestMapping("/throw")
    @ResponseBody
    public String t() {
        throw new RuntimeException();
    }


}
