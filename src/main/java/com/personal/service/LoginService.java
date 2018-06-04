package com.personal.service;

import com.personal.domain.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * The Interface LoginPublicService.
 *
 * @author denis casajus
 */
public interface LoginService {

	User find(Object request);

}
