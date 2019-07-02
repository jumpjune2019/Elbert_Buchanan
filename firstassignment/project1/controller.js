var Controller = (function() {

	var addButtonClickEvent = function(textTrigger, event) {
		var model = this;
		var value = textTrigger.value.trim();//trim removes whitespace from strings
		if(value.length) {
			if(model.notDuplicate(value)) {
				model.Add(value);
				textTrigger.value = null;
			} else {
				alert("Duplicate Value");
			}
		};
	
	};


	var deleteButtonClickEvent = function(event) {
		var model = this;
		if(event.target.type == "button") {
			model.Delete(event.target.value);
		
		}
	
	}

	var constructor = function() {

		var scopeEl;
		var model;
		var view;

		this.init = function(el, m, v) {
			scopeEl = el;
			model = m;
			view = v;
			model.setScope(el);
			model.setView(view);
			model.registerWidget(view.listView());
			model.registerWidget(view.summaryView());
			model.refreshWidgets(view, model);
			
			
			var addButton = view.triggerField().getButtonInstance(el);
			var textTrigger = view.triggerField().getTextInstance(el);
			
			addButton.addEventListener("click", addButtonClickEvent.bind(model, textTrigger));
			
			//New operation will go here
			//EventListener that will trigger the action
			//keyup -- The "event" function is givn additional functionality with keyup 
			textTrigger.addEventListener("keyup", function(event) {
				
				// -The keycode for the enter key is '13'
				if (event.keyCode === 13) {
					event.preventDefault();//.preventDefault prevents the Enter key default action
					addButton.click();
					//The addButton
			  	}
			});			
			
			var listViewEl = scopeEl.getElementsByClassName('listWrapper')[0];
			listViewEl.addEventListener("click", deleteButtonClickEvent.bind(model));
			
		};
		
	};
	
	return new constructor();
	
	
});









