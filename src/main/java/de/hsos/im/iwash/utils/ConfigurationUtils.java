/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.im.iwash.utils;

import com.google.gson.Gson;
import de.hsos.im.iwash.conf.PerfectWashConfiguration;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.faces.context.FacesContext;

/**
 *
 * @author H. Tenbeitel
 */
public class ConfigurationUtils {

    public static void saveConfiguration(String fileName, Object obj) throws IOException {
        Gson gson = new Gson();
        String json = gson.toJson(obj);

        String path = FacesContext.getCurrentInstance().getExternalContext().getRealPath("") + "\\" + "conf" + "\\" + fileName;

        try (FileWriter writer = new FileWriter(path)) {
            writer.write(json);
        }
    }

    public static PerfectWashConfiguration loadPerfectWashConfiguration(String fileName) throws FileNotFoundException {
        Gson gson = new Gson();

        BufferedReader br = new BufferedReader(
                new FileReader(FacesContext.getCurrentInstance().getExternalContext().getRealPath("") + "\\" + "conf" + "\\" + fileName));

        //convert the json string back to object
        PerfectWashConfiguration obj = gson.fromJson(br, PerfectWashConfiguration.class);

        return obj;
    }
}
