package peaksoft;

import peaksoft.dao.UserDaoHibernateImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDaoHibernateImpl userDao=new UserDaoHibernateImpl();
        userDao.createUsersTable();
    }
}
