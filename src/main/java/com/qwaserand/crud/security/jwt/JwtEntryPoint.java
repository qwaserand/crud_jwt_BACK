package com.qwaserand.crud.security.jwt;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;
//va a comprobar si hay un token valido, sino devuelve respuesta 401
//no autorizado.
@Component
public class JwtEntryPoint implements AuthenticationEntryPoint {

    private final static Logger logger = LoggerFactory.getLogger(JwtEntryPoint.class);
    
    @Override
    public void commence(HttpServletRequest req, HttpServletResponse res, 
            AuthenticationException e) throws IOException, ServletException {
        
        logger.error("fail en el método commence");
        res.sendError(HttpServletResponse.SC_UNAUTHORIZED, "no autorizado");
        //res envia el error
    }
     
}
