
window.werm = {
  wermRun: function (name, onSuccess, onFail) {
    cordova.exec(onSuccess, onFail, "werm", "wermRun", [name]);
  }
};

