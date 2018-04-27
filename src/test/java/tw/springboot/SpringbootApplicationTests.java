package tw.springboot;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import tw.springboot.controller.EmployeesController;
import tw.springboot.core.Employee;

import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MockServletContext.class)
public class SpringbootApplicationTests {
    private MockMvc mvc;
    RequestBuilder requestBuilder;

    @Before
    public void setUp() {
        mvc = MockMvcBuilders.standaloneSetup(new EmployeesController()).build();
        requestBuilder = null;
    }

    @Test
    public void should_return_all_employees_json_when_get_all() throws Exception {
        requestBuilder = get("/employees/");
        mvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[{\"id\":0,\"name\":\"小明\",\"age\":20,\"gender\":\"男\"},{\"id\":1,\"name\":\"小红\",\"age\":19,\"gender\":\"女\"},{\"id\":2,\"name\":\"小智\",\"age\":15,\"gender\":\"男\"},{\"id\":3,\"name\":\"小刚\",\"age\":16,\"gender\":\"男\"},{\"id\":4,\"name\":\"小霞\",\"age\":15,\"gender\":\"女\"}]")));
    }

    @Test
    public void should_return_id_0_employee_when_get_0() throws Exception {
        requestBuilder = get("/employees/0");
        mvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("{\"id\":0,\"name\":\"小明\",\"age\":20,\"gender\":\"男\"}")));
    }

    @Test
    public void should_return_add_success_when_post_employee_json() throws Exception {
        requestBuilder = post("/employees/")
                .param("id", "5")
                .param("name", "小明")
                .param("age", "20")
                .param("gender", "男");
        mvc.perform(requestBuilder)
                .andExpect(content().string(equalTo("add success")));
    }

    @Test
    public void should_return_delete_success_when_delete_employee() throws Exception {
        requestBuilder = delete("/employees/0");
        mvc.perform(requestBuilder)
                .andExpect(content().string(equalTo("delete success")));
    }

    @Test
    public void should_return_update_success_when_update_one_employee() throws Exception {
        requestBuilder = put("/employees/0")
                .param("name", "小红")
                .param("age", "20")
                .param("gender", "女");
        mvc.perform(requestBuilder)
                .andExpect(content().string(equalTo("update success")));
    }

}
