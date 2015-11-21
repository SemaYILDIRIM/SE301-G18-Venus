package DAO;
// Generated Nov 16, 2015 9:40:26 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Projectuser generated by hbm2java
 */
public class Projectuser  implements java.io.Serializable {


     private Integer id;
     private Project project;
     private User user;
     private Date creationDate;

    public Projectuser() {
    }

	
    public Projectuser(Project project,User user) {
        this.project = project;
        this.user = user;
    }
    public Projectuser(Project project,User user, Date creationDate) {
       this.project = project;
       this.user = user;
       this.creationDate = creationDate;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Project getProject() {
        return this.project;
    }
    
    public void setProject(Project project) {
        this.project = project;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public Date getCreationDate() {
        return this.creationDate;
    }
    
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }




}


