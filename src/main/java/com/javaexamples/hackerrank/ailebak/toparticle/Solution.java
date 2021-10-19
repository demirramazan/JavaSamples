package com.javaexamples.hackerrank.ailebak.toparticle;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;


class Result {

    /*
     * Complete the 'topArticles' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING username
     *  2. INTEGER limit
     *
     * base url for copy/paste
     * https://jsonmock.hackerrank.com/api/articles?author=<username>&page=<pageNumber>
     */


    public static List<String> topArticles(String username, int limit) {

        try {
            String url = "https://jsonmock.hackerrank.com/api/articles?author=" + username + "&page=1";

            HttpsURLConnection httpClient = (HttpsURLConnection) new URL(url).openConnection();

            //add reuqest header
            httpClient.setRequestMethod("GET");
            httpClient.setRequestProperty("Accept", "application/json");


            int responseCode = httpClient.getResponseCode();

            System.out.println("Response Code : " + responseCode);
            List<String> resultList = new ArrayList<>();
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(httpClient.getInputStream()))) {

                String line;
                StringBuilder response = new StringBuilder();

                while ((line = in.readLine()) != null) {
                    response.append(line);
                }

                //print result
                System.out.println(response);
                ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                Response response1 = objectMapper.readValue(response.toString(), Response.class);
                ResponseDetail responseDetail = Arrays.asList(response1.getData()).stream()
                        .filter(r -> Objects.nonNull(r.getNum_comments()))
                        .max(Comparator.comparing(ResponseDetail::getNum_comments)).orElse(null);

                if (responseDetail != null) {
                    for (ResponseDetail detail : response1.getData()) {
                        if (responseDetail.getNum_comments() == detail.getNum_comments()) {
                            if (detail.getTitle() == null) {
                                resultList.add(detail.getStory_title());
                            } else {
                                resultList.add(detail.getTitle());
                            }
                        }

                    }
                }

            }
            return resultList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String username = "epaga";

        int limit = 1;

        List<String> result = Result.topArticles(username, limit);

//        bufferedWriter.write(
//                result.stream()
//                        .collect(joining("\n"))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}

class Response {
    Integer page;
    Integer per_page;
    Integer total;
    Integer total_pages;
    ResponseDetail[] data;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPer_page() {
        return per_page;
    }

    public void setPer_page(Integer per_page) {
        this.per_page = per_page;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(Integer total_pages) {
        this.total_pages = total_pages;
    }

    public ResponseDetail[] getData() {
        return data;
    }

    public void setData(ResponseDetail[] data) {
        this.data = data;
    }
}

class ResponseDetail {
    String title;
    String url;
    String author;
    Integer num_comments;
    Integer story_id;
    String story_title;
    String story_url;
    Integer parent_id;
    Long created_at;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getNum_comments() {
        return num_comments;
    }

    public void setNum_comments(Integer num_comments) {
        this.num_comments = num_comments;
    }

    public Integer getStory_id() {
        return story_id;
    }

    public void setStory_id(Integer story_id) {
        this.story_id = story_id;
    }

    public String getStory_title() {
        return story_title;
    }

    public void setStory_title(String story_title) {
        this.story_title = story_title;
    }

    public String getStory_url() {
        return story_url;
    }

    public void setStory_url(String story_url) {
        this.story_url = story_url;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public Long getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Long created_at) {
        this.created_at = created_at;
    }
}