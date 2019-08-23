package br.com.keyrus.test.util;

import br.com.keyrus.test.dto.ProductsDTO;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

@Slf4j
public class KeyrusUtils {

    public static ProductsDTO create()
    {
        ProductsDTO productDTO = null;

        try
        {
            Reader reader = new FileReader(new File(ClassLoader.getSystemResource("productPage.json").getFile()));
            Gson gson  = new Gson();
            productDTO = gson.fromJson(reader,ProductsDTO.class);

        }catch(IOException cause)
        {
            log.warn("not found file ", cause);
        }
        return productDTO;
    }
}
