/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2017-12-21 09:51:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.airtimeManager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.htc.airtime.dao.AccountDAO;
import com.htc.airtime.model.Services;
import com.htc.airtime.dao.ServicesDAO;
import com.htc.airtime.components.Helper;
import com.htc.airtime.model.UserServices;
import com.htc.airtime.dao.UserServicesDAO;
import com.htc.airtime.dao.AccountDAO;
import com.htc.airtime.components.Tool;
import com.htc.airtime.model.Account;
import com.htc.airtime.components.Helper;
import com.htc.airtime.dao.AccountDAO;
import com.htc.airtime.model.Account;
import com.htc.airtime.components.Tool;
import com.htc.airtime.dao.AccountDAO;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(8);
    _jspx_dependants.put("/airtimeManager/../includes/head.jsp", Long.valueOf(1513046144000L));
    _jspx_dependants.put("/airtimeManager/../includes/../includes/checkLogin.jsp", Long.valueOf(1513046144000L));
    _jspx_dependants.put("/airtimeManager/../includes/topFooter.jsp", Long.valueOf(1513046144000L));
    _jspx_dependants.put("/airtimeManager/../includes/topMenu.jsp", Long.valueOf(1513046144000L));
    _jspx_dependants.put("/airtimeManager/../includes/mainMenu.jsp", Long.valueOf(1513046144000L));
    _jspx_dependants.put("/airtimeManager/../includes/breadcrumb.jsp", Long.valueOf(1513046144000L));
    _jspx_dependants.put("/airtimeManager/../includes/footerJs.jsp", Long.valueOf(1513046144000L));
    _jspx_dependants.put("/airtimeManager/common.jsp", Long.valueOf(1513046141000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.htc.airtime.components.Tool");
    _jspx_imports_classes.add("com.htc.airtime.components.Helper");
    _jspx_imports_classes.add("com.htc.airtime.model.UserServices");
    _jspx_imports_classes.add("com.htc.airtime.dao.UserServicesDAO");
    _jspx_imports_classes.add("com.htc.airtime.dao.ServicesDAO");
    _jspx_imports_classes.add("com.htc.airtime.model.Account");
    _jspx_imports_classes.add("com.htc.airtime.model.Services");
    _jspx_imports_classes.add("com.htc.airtime.dao.AccountDAO");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');

    String baseUrl = request.getContextPath();
    if (Tool.checkNull(session.getAttribute("acc"))) {
        try {
            response.sendRedirect("/login.jsp");
            return;
        } catch (Exception e) {
            System.out.println("CO LOI NHA");
        }
    }
    String nameUser = "";
    String cpCodeUser = "";
    String checkTypeUser = "";
    int idUser = 0;
    Account acc = null;
    if (!Tool.checkNull(session.getAttribute("acc"))) {
        acc = (Account) session.getAttribute("acc");
        idUser = acc.getAccId();
        nameUser = acc.getUserName();
        cpCodeUser = acc.getCpCode();
        checkTypeUser = AccountDAO.TYPE.getType(acc.getUserType()).toString();
    }

      out.write(' ');
      out.write("<!DOCTYPE html><html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>CMS AirTime [sv1]</title>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print( baseUrl);
      out.write("/resource/css/bootstrap.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print( baseUrl);
      out.write("/resource/css/bootstrap-responsive.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print( baseUrl);
      out.write("/resource/css/colorpicker.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print( baseUrl);
      out.write("/resource/css/datepicker.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print( baseUrl);
      out.write("/resource/css/uniform.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print( baseUrl);
      out.write("/resource/css/select2.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print( baseUrl);
      out.write("/resource/css/maruti-style.css?v=1.0\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print( baseUrl);
      out.write("/resource/css/maruti-media.css\" class=\"skin-color\" />\n");
      out.write("        <script src =\"");
      out.print( baseUrl);
      out.write("/resource/js/jquery.min.js\"></script> \n");
      out.write("        <script src =\"");
      out.print( baseUrl);
      out.write("/resource/js/select2.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            .checker{\n");
      out.write("                vertical-align: initial;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\"><!--Header-part-->\n");
      out.write("            <h1><a href=\"");
      out.print( baseUrl);
      out.write("\">CMS AirTime</a></h1>\n");
      out.write("        </div>");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');


    String moduleSourse = "airtimeManager";
    String moduleName = "Dịch vụ AirTime";

      out.write('\n');
      out.write('\n');
    //
    Helper.cLogin(response, session);

    AccountDAO account = new AccountDAO();
    boolean checkPermission = account.checkView(request, session);
    Helper.cPermission(response, checkPermission);

    String actionName = "Chi tiết";

//    String imgActive = "<img width='20' src='" + baseUrl + "/resource/images/icon/active.png' alt='Kích hoạt' title='Kích hoạt'/>";
//    String imgInActive = "<img width='20' src='" + baseUrl + "/resource/images/icon/inActive.png' alt='Không kích hoạt' title='Không kích hoạt'/>";
//    String imgDisable = "<img width='20' src='" + baseUrl + "/resource/images/icon/disable.png' alt='Hủy kích hoạt' title='Hủy kích hoạt'/>";
    int id = 0;
    int idService = 0;
    String cp_code = "";
    String username = "";
    String game_code = "";
    String game_name = "";
    String urlCallback = "";
    String optionData = "";
    String description = "";
    int status = 0;
    id = Integer.parseInt(request.getParameter("id"));

    String aliasService = "airTime";
    ServicesDAO service = new ServicesDAO();
    Services dtService = new Services();
    dtService = service.serviceByAlias(aliasService);
    idService = dtService.getID();

    UserServicesDAO userServices = new UserServicesDAO();
    UserServices dt = new UserServices();

    dt = userServices.view(id);
    int idUserService = dt.getId();


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--close-Header-part--> \n");
      out.write("\n");
      out.write("<!--top-Header-menu-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--top-Header-menu-->\n");
      out.write("<div id=\"user-nav\" class=\"navbar navbar-inverse\">\n");
      out.write("    <ul class=\"nav\">\n");
      out.write("       \n");
      out.write("        <li class=\" dropdown\" id=\"menu-messages\"><a href=\"#\" data-toggle=\"dropdown\" data-target=\"#menu-messages\" class=\"dropdown-toggle\"><i class=\"icon icon-user\"></i> <span class=\"text\">");
      out.print( nameUser);
      out.write(" ---\n");
      out.write("                    ");
      out.print( checkTypeUser);
      out.write("</span> <span class=\"label label-important\">5</span> <b class=\"caret\"></b></a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a class=\"sAdd\" title=\"\" href=\"#\">Xem thông tin user</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"\"><a title=\"\" href=\"");
      out.print( baseUrl);
      out.write("/logout\" onclick=\"return confirm('Bạn có chắc muốn thoát?')\" ><i class=\"icon icon-share-alt\"></i> <span class=\"text\">Logout</span></a></li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--close-top-Header-menu--> \n");
      out.write("<!--left-menu-stats-sidebar-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    AccountDAO accountPermission = new AccountDAO();

    boolean checkAccounts = true;
    boolean checkUserPermission = true;
    boolean checkModules = true;
    boolean checkServices = true;
    boolean checkAirtimeManager = true;
    boolean checkOtpAirTime = true;
    boolean checkChargeAirTime = true;
    boolean checkErrorOtpAirTime = true;
    boolean checkErrorChargeAirTime = true;

//    checkAccounts = accountPermission.checkList(request, session, "accounts");
//    checkUserPermission = accountPermission.checkList(request, session, "userPermission");
//    checkModules = accountPermission.checkList(request, session, "modules");
//    checkServices = accountPermission.checkList(request, session, "services");
//    checkAirtimeManager = accountPermission.checkList(request, session, "airtimeManager");
//    checkOtpAirTime = accountPermission.checkList(request, session, "otpAirTime");
//    checkChargeAirTime = accountPermission.checkList(request, session, "chargeAirTime");
//    checkErrorOtpAirTime = accountPermission.checkList(request, session, "errorOtpAirTime");
//    checkErrorChargeAirTime = accountPermission.checkList(request, session, "errorChargeAirTime");

      out.write("\n");
      out.write("<div id=\"sidebar\">\n");
      out.write("    <a href=\"#\" class=\"visible-phone\"><i class=\"icon icon-th-list\"></i> Common Elements</a><ul>\n");
      out.write("        <li class=\"active\"><a href=\"/\"><i class=\"icon icon-home\"></i> <span>Trang chủ</span></a> </li>\n");
      out.write("        ");
 if (checkTypeUser.equals("ADMIN") || checkTypeUser.equals("AGENCY_MANAGER") ) {
      out.write("\n");
      out.write("        <li class=\"submenu\"> <a href=\"#\"><i class=\"icon icon-th-list\"></i> <span>Quản lý</span></a>\n");
      out.write("            <ul>\n");
      out.write("               ");
 if (checkTypeUser.equals("ADMIN") ) {
      out.write("\n");
      out.write("                <li class=\"\"><a href=\"");
      out.print( baseUrl);
      out.write("/accounts\"><i class=\"icon icon-th-list\"></i> <span>Tài khoản</span></a> </li>\n");
      out.write("               ");
}
      out.write("\n");
      out.write("               ");
 if (checkTypeUser.equals("AGENCY_MANAGER") ) {
      out.write("\n");
      out.write("                <li class=\"\"><a href=\"");
      out.print( baseUrl);
      out.write("/accounts\"><i class=\"icon icon-th-list\"></i> <span>Tài khoản</span></a> </li>\n");
      out.write("               ");
}
      out.write("\n");
      out.write("               ");
 if (checkTypeUser.equals("ADMIN") ) {
      out.write("\n");
      out.write("                <li class=\"\"><a href=\"");
      out.print( baseUrl);
      out.write("/modules\"><i class=\"icon icon-th-list\"></i> <span>Module</span></a> </li>\n");
      out.write("                <li class=\"\"><a href=\"");
      out.print( baseUrl);
      out.write("/services\"><i class=\"icon icon-th-list\"></i> <span>Dịch vụ</span></a> </li>\n");
      out.write("                <li class=\"\"><a href=\"");
      out.print( baseUrl);
      out.write("/airtimeManager\"><i class=\"icon icon-th-list\"></i> <span>Đăng ký dịch vụ airtime</span></a> </li>\n");
      out.write("                <li class=\"\"><a href=\"");
      out.print( baseUrl);
      out.write("/userPermission\"><i class=\"icon icon-th-list\"></i> <span>Phân quyền tài khoản</span></a> </li>\n");
      out.write("               ");
}
      out.write("\n");
      out.write("               ");
 if (checkTypeUser.equals("AGENCY_MANAGER") ) {
      out.write("\n");
      out.write("                <!--//DANH CHO DAI LY-->\n");
      out.write("                <li class=\"\"><a href=\"");
      out.print( baseUrl);
      out.write("/userPermissionChild\"><i class=\"icon icon-th-list\"></i> <span>Phân quyền tài khoản</span></a> </li>\n");
      out.write("               ");
}
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("\n");
      out.write("        <li class=\"\"> <a href=\"");
      out.print( baseUrl);
      out.write("/reqAll\"><i class=\"icon icon-th-list\"></i> <span>Lịch sử Charging</span> </a>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"");
      out.print( baseUrl);
      out.write("/reqOtp\">OTP</a></li>\n");
      out.write("                <li><a href=\"");
      out.print( baseUrl);
      out.write("/reqCharging\">Charging</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"submenu\"> <a href=\"#\"><i class=\"icon icon-th-list\"></i> <span>Thống kê Charging</span> </a>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"");
      out.print( baseUrl);
      out.write("/reqCharging/statistic.jsp\">Charging</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"\"> <a href=\"");
      out.print( baseUrl);
      out.write("/charging\"><i class=\"icon icon-th-list\"></i> <span>Charging</span> </a>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("</div>");
      out.write("\n");
      out.write("<!--close-left-menu-stats-sidebar-->\n");
      out.write("\n");
      out.write("<div id=\"content\">\n");
      out.write("    <div id=\"content-header\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"breadcrumb\"> \n");
      out.write("    <a href=\"/\" title=\"Go to Home\" class=\"tip-bottom\"><i class=\"icon-home\"></i> Trang chủ</a> \n");
      out.write("    <!--nameModule ,nameAction được khai báo bên view action-->\n");
      out.write("    \n");
      out.write("    <a href=\"");
      out.print( baseUrl +"/"+ moduleSourse );
      out.write("\" class=\"tip-bottom\">");
 if(moduleName != ""){out.println(moduleName);
    } 
      out.write("</a> \n");
      out.write("    <a href=\"#\" class=\"current\">");
 if(actionName != ""){out.println(actionName);
    } 
      out.write("</a> \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row-fluid\">\n");
      out.write("            <div class=\"span7 offset2\">\n");
      out.write("                <div class=\"widget-box\">\n");
      out.write("                    <div class=\"widget-title\"><span class=\"icon\"> <i class=\"icon-ok-sign\"></i> </span>\n");
      out.write("                        <h5>Chi tiết Module : <b>");
      out.print( game_name);
      out.write("</b></h5>\n");
      out.write("                        <span class=\"icon\"><a class=\"\" href=\"");
      out.print( baseUrl);
      out.write('/');
      out.print( moduleSourse);
      out.write("\" title=\"Danh sách\" style=\"padding:0 2px;\">\n");
      out.write("                                ");
      out.print( Helper.getImageIcon("home", baseUrl));
      out.write(" Danh sách</a>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"icon\"><a class=\"\" href=\"");
      out.print( baseUrl);
      out.write('/');
      out.print( moduleSourse);
      out.write("/add.jsp\" title=\"Thêm mới\" style=\"padding:0 2px;\">\n");
      out.write("                                ");
      out.print( Helper.getImageIcon("add", baseUrl));
      out.write(" Thêm mới</a>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"icon\"><a class=\"\" href=\"");
      out.print( baseUrl);
      out.write('/');
      out.print( moduleSourse);
      out.write("/update.jsp?id=");
      out.print( id);
      out.write("\" title=\"Cập nhật\" style=\"padding:0 2px;\">\n");
      out.write("                                ");
      out.print( Helper.getImageIcon("update", baseUrl));
      out.write(" Cập nhật</a>\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"widget-content\">\n");
      out.write("                        ");

                            if (idUserService != 0 && idService == dt.getServiceType()) {
                                cp_code = dt.getCpCode();
                                username = dt.getUserName();
                                game_code = dt.getCodeGame();
                                game_name = dt.getGameName();
                                urlCallback = dt.getUrlCallback();
                                description = dt.getDescription();
                                optionData = dt.getOptionData();
                                status = dt.getStatus();
                        
      out.write("\n");
      out.write("                        <table class=\"table table-bordered table-striped\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th style=\"width: 100px\"></th>\n");
      out.write("                                    <th>Chi tiết</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td style=\"width: 100px\"><span class=\"\">CP code</span></td>\n");
      out.write("                                    <td>");
      out.print( cp_code);
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td style=\"width: 100px\"><span class=\"\">Tài khoản</span></td>\n");
      out.write("                                    <td>");
      out.print( username);
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td style=\"width: 100px\"><span class=\"\">Mã game</span></td>\n");
      out.write("                                    <td>");
      out.print( game_code);
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td style=\"width: 100px\"><span class=\"\">Tên game</span></td>\n");
      out.write("                                    <td>");
      out.print( game_name);
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td style=\"width: 100px\"><span class=\"\">Url Callback</span></td>\n");
      out.write("                                    <td>");
      out.print( urlCallback);
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td style=\"width: 100px\"><span class=\"\">option Data/span></td>\n");
      out.write("                                    <td>");
      out.print( optionData);
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td style=\"width: 100px\"><span class=\"\">Miêu tả</span></td>\n");
      out.write("                                    <td>");
      out.print( description);
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td style=\"width: 100px\"><span class=\"\">Trạng thái</span></td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");

                                            String imgStatus = "";
                                            if (status == 0) {
                                                imgStatus = Helper.getImageIcon("inActive", baseUrl);
                                            } else if (status == 1) {
                                                imgStatus = Helper.getImageIcon("active", baseUrl);
                                            } else {
                                                imgStatus = Helper.getImageIcon("disable", baseUrl);
                                            }
                                            out.println(imgStatus);
                                        
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                        ");

                            } else {
                                String redirectURL = baseUrl + "/" + moduleSourse;
                                response.sendRedirect(redirectURL);
                            }
                        
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<div class=\"row-fluid\">\n");
      out.write("    <div id=\"footer\" class=\"span12\">2017 &copy;. Thiết kế bởi <a href=\"/\">DNH</a> </div>\n");
      out.write("</div>");
      out.write('\n');
      out.write("    <script src =\"");
      out.print( baseUrl );
      out.write("/resource/js/jquery.ui.custom.js\"></script> \n");
      out.write("    <script src =\"");
      out.print( baseUrl );
      out.write("/resource/js/bootstrap.min.js\"></script> \n");
      out.write("    <script src =\"");
      out.print( baseUrl );
      out.write("/resource/js/bootstrap-colorpicker.js\"></script> \n");
      out.write("    <script src =\"");
      out.print( baseUrl );
      out.write("/resource/js/bootstrap-datepicker.js?v=1.0.0\"></script> \n");
      out.write("    <script src =\"");
      out.print( baseUrl );
      out.write("/resource/js/jquery.uniform.js\"></script> \n");
      out.write("    <script src =\"");
      out.print( baseUrl );
      out.write("/resource/js/maruti.js\"></script> \n");
      out.write("    <script src =\"");
      out.print( baseUrl );
      out.write("/resource/js/maruti.tables.js\"></script>\n");
      out.write("    <script src =\"");
      out.print( baseUrl );
      out.write("/resource/js/maruti.form_common.js\"></script>\n");
      out.write("    <script src =\"");
      out.print( baseUrl );
      out.write("/resource/js/jquery.dataTables.min.js?v=1.0.1\"></script> \n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
