package com.saha.persistence.entity;

import java.util.Date;  
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

/**
 * @author Alper
 */
@MappedSuperclass
public class BaseEntity {

    @CreatedDate
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date createDate;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @LastModifiedDate
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date lastModifiedDate;
}
