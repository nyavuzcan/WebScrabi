package com.sahibindenService;

import java.io.IOException;

public interface Pagination  {
  String getLastPage(String baseUrl) throws IOException;
}
