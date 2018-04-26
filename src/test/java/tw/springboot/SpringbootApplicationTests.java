package tw.springboot;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import tw.springboot.controller.EmployeesController;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MockServletContext.class)
public class SpringbootApplicationTests {
    private MockMvc mvc;

    @Before
    public void setUp() {
        mvc = MockMvcBuilders.standaloneSetup(new EmployeesController()).build();
    }

    @Test
    public void testEmployeesController() throws Exception {
        // 1、get查一下user列表，应该为空
        RequestBuilder requestBuilder = null;
        requestBuilder = get("/employees/");
        mvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[]")));

        // 2、post提交一个user
        requestBuilder = post("/employees/")
                .param("id", "1")
                .param("name", "小明")
                .param("age", "20")
                .param("gender", "男");
        mvc.perform(requestBuilder)
                .andExpect(content().string(equalTo("add success")));

        // 3、get获取user列表，应该有刚才插入的数据
        requestBuilder = get("/employees/");
        mvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[{\"id\":1,\"name\":\"小明\",\"age\":20,\"gender\":\"男\"}]")));

        // 4、put修改id为1的user
        requestBuilder = put("/employees/1")
                .param("name", "小红")
                .param("age", "20")
                .param("gender", "女");
        mvc.perform(requestBuilder)
                .andExpect(content().string(equalTo("update success")));

        // 6、del删除id为1的user
        requestBuilder = delete("/employees/1");
        mvc.perform(requestBuilder)
                .andExpect(content().string(equalTo("delete success")));

        // 7、get查一下user列表，应该为空
        requestBuilder = get("/employees/");
        mvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[]")));
    }

}
