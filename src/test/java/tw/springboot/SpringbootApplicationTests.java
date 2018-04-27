package tw.springboot;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import tw.springboot.controller.EmployeesController;
import tw.springboot.core.Employee;

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
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new EmployeesController()).build();
        requestBuilder = post("/employees/")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"id\":0,\"name\":\"小明\",\"age\":20,\"gender\":\"男\"}");
        mvc.perform(requestBuilder);
    }

    @Test
    public void should_return_all_employees_json_when_get_all() throws Exception {
        requestBuilder = get("/employees/");
        mvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[{\"id\":0,\"name\":\"小明\",\"age\":20,\"gender\":\"男\"}]")));
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
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"id\":0,\"name\":\"小明\",\"age\":20,\"gender\":\"男\"}");
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
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"id\":0,\"name\":\"小红\",\"age\":20,\"gender\":\"女\"}");
        mvc.perform(requestBuilder)
                .andExpect(content().string(equalTo("update success")));
        requestBuilder = get("/employees/0");
        mvc.perform(requestBuilder)
                .andExpect(content().string(equalTo("{\"id\":0,\"name\":\"小红\",\"age\":20,\"gender\":\"女\"}")));
    }

}
