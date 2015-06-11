package eu.nekoko.gwtquery.flexnav.client;

import com.google.gwt.core.client.Scheduler;
import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.Function;
import com.google.gwt.query.client.GQuery;
import com.google.gwt.query.client.plugins.Plugin;
import static com.google.gwt.query.client.plugins.Effects.Effects;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;

/**
 * Flexnav for GwtQuery
 */
public class Flexnav extends GQuery {


  // A shortcut to the class 
  public static final Class<Flexnav> Flexnav = Flexnav.class;

  // Register the plugin in GQuery
  static {
    GQuery.registerPlugin(Flexnav.class, new Plugin<Flexnav>() {
      @Override
      public Flexnav init(GQuery gq) {
        return new Flexnav(gq);
      }
    });
  }

  // Initialization
  public Flexnav(GQuery gq) {
    super(gq);
  }
  
  protected void showMenu(final FlexnavOptions options) {
    if (hasClass("lg-screen") && options.isHover()) {
        if (options.isTransitionOpacity()) {
          find(">ul").addClass("flexnav-show").stop(true, true).animate("height: ['toggle', 'swing'], opacity: 'toggle'", options.getAnimationSpeed());
        } else {
          find(">ul").addClass("flexnav-show").stop(true, true).animate("height: ['toggle', 'swing']", options.getAnimationSpeed());
        }
    }
  }

  protected void resizer(final FlexnavOptions options, int breakpoint) {
//      var selector;
      if ($(window).width() <= breakpoint) {
        removeClass("lg-screen").addClass("sm-screen");
        if (options.isCalcItemWidths()) {
  //        $top_nav_items.css('width', '100%');
        }
        $(options.getButtonSelector() + ", " + options.getButtonSelector() + " .touch-button").removeClass("active");
        $(".one-page li a").on("click", new  Function() {
          @Override
          public void f() {
            $(Flexnav.this).removeClass("flexnav-show");
          }
        });
        return;
      }
      if ($(window).width() > breakpoint) {
        removeClass("sm-screen").addClass("lg-screen");
        if (options.isCalcItemWidths()) {
//          $top_nav_items.css('width', nav_percent);
        }
        removeClass("flexnav-show").find(".item-with-ul").on("click");
        $(".item-with-ul").find("ul").removeClass("flexnav-show");
        resetMenu(options);
        if (options.isHoverIntent()) {
/*          return $('.item-with-ul').hoverIntent({
            over: showMenu,
            out: resetMenu,
            timeout: settings.hoverIntentTimeout
          });*/
        } else if (!options.isHoverIntent()) {
          $(".item-with-ul").on("mouseenter", new Function() {
            @Override
            public void f() {
              showMenu(options);
            }
          }).on("mouseleave", new Function() {
            @Override
            public void f() {
              resetMenu(options);
            }
          });
        }
      }
    };

  protected void resetMenu(final FlexnavOptions options) {
      if (hasClass("lg-screen") && find(">ul").hasClass("flexnav-show") && options.isHover()) {
        if (options.isTransitionOpacity()) {
          find(">ul").addClass("flexnav-show").stop(true, true).animate("height: ['toggle', 'swing'], opacity: 'toggle'", options.getAnimationSpeed());
        } else {
          find(">ul").addClass("flexnav-show").stop(true, true).animate("height: ['toggle', 'swing']", options.getAnimationSpeed());
        }
      }
  }

  // This pluggin adds this to the set of available methods in GQuery
  public Flexnav flexnav() {
    return flexnav(new FlexnavOptions());
  }

  public Flexnav flexnav(final FlexnavOptions options) {
    addClass("with-js");
    if (options.isTransitionOpacity()) {
      addClass("opacity");
    }

    find("li").each(new Function() {
      @Override
      public void f(Element e) {
        if ($(e).has("ul").length() > 0) {
          $(e).addClass("item-with-ul").find("ul").hide();
        }
      }
    });

    final int breakpoint = 0;
/*
    if (settings.calcItemWidths === true) {
      $top_nav_items = $nav.find('>li');
      count = $top_nav_items.length;
      nav_width = 100 / count;
      nav_percent = nav_width + "%";
    }
    if ($nav.data('breakpoint')) {
      breakpoint = $nav.data('breakpoint');
    }
    
    $(settings['buttonSelector']).data('navEl', $nav);
    touch_selector = '.item-with-ul, ' + settings['buttonSelector'];
    $(touch_selector).append('<span class="touch-button"><i class="navicon icon_submenu"></i></span>');
    toggle_selector = settings['buttonSelector'] + ', ' + settings['buttonSelector'] + ' .touch-button';
    $(toggle_selector).on('click', function(e) {
      var $btnParent, $thisNav, bs;
      $(toggle_selector).toggleClass('active');
      e.preventDefault();
      e.stopPropagation();
      bs = settings['buttonSelector'];
      $btnParent = $(this).is(bs) ? $(this) : $(this).parent(bs);
      $thisNav = $btnParent.data('navEl');
      return $thisNav.toggleClass('flexnav-show');
    });
    $('.touch-button').on('click', function(e) {
      var $sub, $touchButton;
      $sub = $(this).parent('.item-with-ul').find('>ul');
      $touchButton = $(this).parent('.item-with-ul').find('>span.touch-button');
      if ($nav.hasClass('lg-screen') === true) {
        $(this).parent('.item-with-ul').siblings().find('ul.flexnav-show').removeClass('flexnav-show').hide();
      }
      if ($sub.hasClass('flexnav-show') === true) {
        $sub.removeClass('flexnav-show').slideUp(settings.animationSpeed);
        return $touchButton.removeClass('active');
      } else if ($sub.hasClass('flexnav-show') === false) {
        $sub.addClass('flexnav-show').slideDown(settings.animationSpeed);
        return $touchButton.addClass('active');
      }
    });
    $nav.find('.item-with-ul *').focus(function() {
      $(this).parent('.item-with-ul').parent().find(".open").not(this).removeClass("open").hide();
      return $(this).parent('.item-with-ul').find('>ul').addClass("open").show();
    });
    resizer();
    return $(window).on('resize', resizer);
  };
    */

    resizer(options, 0);
    $(window).on("resize", new Function() {

      @Override
      public void f() {
        resizer(options, 0);
      }
    });

    return this;
  }
}
