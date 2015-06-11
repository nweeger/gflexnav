package eu.nekoko.gwtquery.flexnav.client;

import static com.google.gwt.query.client.GQuery.*;
import static eu.nekoko.gwtquery.flexnav.client.Flexnav.Flexnav;

import com.google.gwt.core.client.EntryPoint;

/**
 * Example code BasePlugin plugin for GwtQuery
 */
public class FlexNavSample implements EntryPoint {
  @Override
  public void onModuleLoad() {
    $("<div/>").as(Flexnav).flexnav();
  }
}
