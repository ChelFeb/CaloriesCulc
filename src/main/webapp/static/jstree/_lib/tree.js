	(function ($) { 
	
		// init all trees and open all nodes (default theme & html data)
		$(function () { 
			$.jstree.defaults.plugins = [ "html_data", "themes", "ui", "wholerow" ];
			$(".demo")
				.jstree()
				.bind("reopen.jstree", function (e, data) { 
					data.inst.open_all(); 
					data.inst.select_node($(this).find("li:last")); 
					data.inst.hover_node($(this).find("li:first")); 
				}); 
		}); 
		
		
		// create grid
		$(function () { 
			var i = -1, c = $("#container"), h = c.height(), d = "";
			for( ; i < h; i += 18) {
				d += '<' + 'div class="grid_line" style="top:' + i + 'px">&#160;<' + '/div>';
			}
			$("#container").append(d);
		});
		$(function () {
			$(".demo").jstree(
				{
					"themes": {
						"theme":"classic",
						"dots":true,
						"icons": false,
					}
				}
			);
		});

         //получение атрибута
        $(function () {
            $('.demo').click( function(event) {

             var id = $('.jstree-clicked').attr('id');
             $('#add_text_value_hide').val(id);
            });
        });

	})(jQuery);