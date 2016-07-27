package io.pivotal;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class SessionControllerTest {
    private MockMvc mvc;

    @Test
    public void test_getSession_returnsAcceptedHTTPStatus() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new SessionController())
                .build();

        mvc.perform(get("/api/session")).andExpect(status().isAccepted());
    }

}
