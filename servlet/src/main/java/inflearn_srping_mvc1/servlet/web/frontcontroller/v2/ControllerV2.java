package inflearn_srping_mvc1.servlet.web.frontcontroller.v1;

import inflearn_srping_mvc1.servlet.web.frontcontroller.MyView;
import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface ControllerV2 {

    MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}
