package br.com.keyrus.test.util;

import br.com.keyrus.test.dto.ProductsDTO;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;

import java.io.*;

@Slf4j
public class KeyrusUtils {


    public static ProductsDTO create()
    {
        ProductsDTO productDTO = null;

        try
        {

            InputStream inputStream = KeyrusUtils.class.getClassLoader().getResourceAsStream("productPage.json");
            Reader reader = new InputStreamReader(inputStream);

            Gson gson  = new Gson();
            productDTO = gson.fromJson(reader,ProductsDTO.class);

        }catch(Exception cause)
        {
            log.warn("not found file ", cause);
        }
        return productDTO;
    }
}
