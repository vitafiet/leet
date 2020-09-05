package com.vitafiet.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Set;

public class PersistentProperties {

    private String propertiesFileName;
    private Properties props;

    private boolean persistentState;

    public PersistentProperties(String filename){
        propertiesFileName = filename;
        persistentState = true;
    }

    public void writeProperty(String key, String value){
        if(props == null)
            props = new Properties();
        props.put(key,value);

        persistentState = false;
    }

    public void persist() throws java.io.FileNotFoundException, java.io.IOException
    {
        FileOutputStream out = new FileOutputStream(propertiesFileName);
        props.store(out, "---No Comment---");
        out.close();

        persistentState = true;
    }

    private void initFromFileIfNeeded()  throws java.io.FileNotFoundException, java.io.IOException
    {
        if(props == null){
            props = new Properties();
            FileInputStream in = new FileInputStream(propertiesFileName);
            props.load(in);
            in.close();
        }
    }

    public Set<Object> getAllKeys() throws java.io.FileNotFoundException, java.io.IOException
    {
        initFromFileIfNeeded();
        return props.keySet();
    }

    public String getValue(Object key) throws java.io.FileNotFoundException, java.io.IOException
    {
        initFromFileIfNeeded();
        return (props.get(key)).toString();
    }

}
