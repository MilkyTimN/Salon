package kg.megacom.salon.microservices;

import com.google.gson.Gson;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import kg.megacom.salon.models.dtos.MasterDto;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;


@Component
public class MasterMicroservice {


    private MasterDto[] masterDto;

    public MasterDto[] getAll() throws IOException{
        String url = "http://10.244.53.136:8082/api/v1/mas/get/all";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        Call call = client.newCall(request);
        Response response = call.execute();


        Gson gson =new Gson();
        return  gson.fromJson(response.body().string(), MasterDto[].class);
    }

}
