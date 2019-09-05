package com.deloitte;



public class hire_table_dao {
	

	public static int persist(hire_table entity) {
		int i= (int) HibernateUtil.getSession().save(entity);
		return i;
    }
 
    public void update(hire_table entity) {
    	
    	HibernateUtil.getSession().update(entity);
    }
 
    public hire_table find(int p1) {
    	hire_table userObj = (hire_table)HibernateUtil.getSession().get(hire_table.class, p1);
        return userObj; 
    }

}
