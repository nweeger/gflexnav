package eu.nekoko.gwtquery.flexnav.client;

import static eu.nekoko.gwtquery.flexnav.client.Flexnav.*;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.query.client.GQuery;

/**
 * Test class for FlexNav plugin
 */
public class FlexnavGwtTest extends GWTTestCase {

  @Override
  public String getModuleName() {
    return "eu.nekoko.gwtquery.flexnav.Flexnav";
  }

  private double fontSize(GQuery g) {
    return 0;
  }

  public void testFlexNavApply() {
    final GQuery g =  $("<div></div>").appendTo(document).as(Flexnav);
  }

}
