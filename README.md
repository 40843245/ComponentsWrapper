# Wrapper of combo of Android Comppose components
## functionality
My package about Android Compose Components.

1. I create some extension function for String type in Kotlin.
    
2. About Android Compose Components,
   
- use less code to instantiate a series of components through wrapping them into classes.
- more maintenable (for code), more extensible (to extend this functionality), and more flexible (to use).
- For more Android Compose components that I wrapped up, see following section.
  
## components

I wrap the following series of Android Compose components into a class.

- `RadioButton` (defined in MyRadioButton.kt)
- `CheckBox` (defined in MyCheckBox.kt)
- `Button` with `Icon` (defined in MyButtonWithIcon.kt)
- `AlertDialog` (defined in MyAlertDialog.kt)
- `DatePicker` (defined in MyDatePicker.kt)
- `TimePicker` (defined in MyTimePicker.kt)
- `DropdownMenu` with its items `DropdownMenuItem`(defined in MyDropdownMenu.kt)
- `LinearProgressIndicator`
- `CircularProgressIndicator`

While for progress indicator -- `LinearProgressIndicator`, `CircularProgressIndicator`, I provide two modes

- `Determinate`
- `Indeterminate`

In `Determinate` mode, the progress indicator will only run the progress once (such as loading game when opening the app)

In `Indeterminate` mode, it will be indeterminate, the progress indicator will run the progress forever until the flag is set to false (it is set to true at first) through such as interrupt of the thread etc.
