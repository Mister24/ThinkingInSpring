package com.fzw.springabc.no002_bean作用范围;

import com.fzw.springabc.no001_bean注入.UserDao;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bossDao")
@ToString
public class BossDaoImpl implements UserDao {
    
    @Value("VP3")
    private String title;
    
    @Value("23")
    private int no;
    
    @Override
    public String save() {
        return "BossDaoImpl#save()";
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public int getNo() {
        return no;
    }
    
    public void setNo(int no) {
        this.no = no;
    }
}
