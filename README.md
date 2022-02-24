# Project Title is User_Account_Web
# Designed based on The Spring Web model-view-controller (MVC) framework that dispatches requests to handlers, with configurable handler mappings, view resolution, locale and theme resolution as well as support for uploading files.
# 3 different JSP file contain with Personal Information (Name, Contact address, Bank Information) get inputed data by User. 
# Show all data in Sucess Jsp file. 

# How It work?

# First Create all JSP file.
# Update pom.xml with all dependencies. 
# create java packages User, User DAO, User BO, User VO. (DAO = Data Access Object, BO = Business Object,VO= Value Object / Entity).
# create class User controller for autowired User BO and User VO. and start session instruction and implementation. 
# create servlet.xml for mapping property and value, applicationContext.xml for bean and web.xml for mapping servlet.
# After user input data, it store in session and display data in sucess.jsp .

